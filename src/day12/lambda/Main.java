package day12.lambda;

import java.util.List;
import static day12.lambda.Color.*;
import static day12.lambda.FilterApple.filter;

public class Main {

    //내부 클래스 생성, 따로 클래스를 만들기 귀찮고, 한번만 쓰니까
    private static class AppleColorPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getColor() == RED || apple.getColor() == YELLOW;
        }

    }

    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        //배열 더 쉽게 표현
        List<Apple> greenApples = FilterApple.filterGreenApples(appleBasket);
        System.out.println("greenApples = " + greenApples);

        System.out.println("=======빨간사과 필터링=========");
        List<Apple> filteredApples1 = FilterApple.filterApplesByColor(appleBasket, RED);
        System.out.println(filteredApples1);

        System.out.println("=======노란사과 필터링=========");
        List<Apple> filteredApples2 = FilterApple.filterApplesByColor(appleBasket, YELLOW);
        System.out.println(filteredApples2);

        System.out.println("============무거운 사과 필터링(100그램 이상)==============");

        //인터페이스를 구체화 시킨 클래스에서 메서드가져와서 활용하기 -> 새롱운 무게의 참, 거짓 값 말해주는 클래스 메서드 생성
        List<Apple> apples1 = FilterApple.filterApples(appleBasket, new AppleWeightPredicate());

        System.out.println("apples1 = " + apples1);
        /*

        System.out.println("=======빨강 혹은 노랑 사과 필터링==========");
        List<Apple> apples2 = filteredApples(appleBasket, new AppleWeightPredicate());
        System.out.println("apples2 = " + apples2);

        //클래스 만들지도 ㅇ낳을거야. 익명 클래스 만들어
        System.out.println("=======빨강 혹은 100그람 이상 필터링==========");
        List<Apple> apples3 = filteredApples(appleBasket, new AppleWeightPredicate()) {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getWeifht() >= 100;
            }
        }

        System.out.println("===========노랑 혹은 100그람 이하================");
        List<Apple> apples4 = filteredApples(appleBasket, new AppleWeightPredicate()) {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getWeifht() >= 100;
            }
        }

        System.out.println("===========녹색사과 필터링==========");
        List<Apple> apple5 = filter(appleBasket, apple -> apple.getColor() == GREEN);
        System.out.println("apple5 = " + apple5);

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        System.out.println("=======even ========");

        List<Integer> filter = filter(numbers, n -> n%2 == 0);
        System.out.println("filter = " + filter);

        System.out.println("=========사과의 색상만 추출=============");
        List<Color> colors = MappingApple.mappingApplesByColor(appleBasket);
        System.out.println("colors = " + colors);

        System.out.println("사과 무게만 추출===================");

        List<Integer> weightList = MappingApple.map(appleBasket, (apple) ->  apple.getWeight();
        System.out.println("weightList = " + weightList);

        System.out.println("=====숫자리스트에서 각 수샂들의 제곱을 추출======");

        List<Integer> pows = MappingApple.map(numbers, n -> n * n);
        System.out.println("pows = " + pows);
        }

         */
    }
}
