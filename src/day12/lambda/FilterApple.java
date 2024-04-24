package day12.lambda;

import java.util.ArrayList;
import java.util.List;

//사과를 여러가지 방법으로 필터링 하는 클래스
public class FilterApple {
    /**
     * @solution - try1: 사과바구니 안에서 색상이 녹색인 사과들만 필터링하고싶을때
     * @param basket : 다양한 사과가 들어있는 리스트
     * @return : basket에서 녹색 사과만 필터링한 리스트
     * @problem - 만약 다른 색의 사과를 필터링 해야 하면 이 메서드는 한계가 있다.
     */
    //수많은 사과중 특정 사과를 골라주세여.
    public static List<Apple> filterGreenApples(List<Apple> basket) {

        //녹색 사과만 담을 바구니 생성
        List<Apple> greenApples = new ArrayList<>();
        //반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    /**
     * @solution - try2 : 색상을 파라미터화 하여 원하는 컬러의 사과를 필터링한다
     * @problem : 필터 기준이 무게 기준일 때 모든 기준에 맞게 파라미터화 한다? ㄴㄴ
     * @param basket - 원하는  필터링 된 key value 넣기
     * @param color - 원하는 필터링 색상
     * @return
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {

        //원하는 색상을 담을 바구니 생성
        List<Apple> filteredApples = new ArrayList<>();
        //반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    /**
     * @solution - try3 : 동작(메서드)을 추상화시켜 파라미터화 한다.
     * @param basket  -try 필터링 대상이 사과가 아니라 오렌지이면? 학생이면 ?
     * @return
     */
    //필터링 조건을 파라미터화 할 수 는 없을 까 ? ? ?
    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate p) {
        List<Apple> filteredApples = new ArrayList<>();

        for (Apple apple : basket) {
            if (p.test(apple)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    /**
     * @solution : 여러 타입 필터링
     * @param basket
     * @param p
     * @return
     */
    //generic type, 타입 복제해서 마음대로 타입을 재설정할 수 있다.
    //관례상 대문자 한글자로 쓴다. 리턴타입 앞에 다시 제너릭 문자를 써줘야 한다.
    public static<T> List<T> filter(List<T> basket,GenericPredicate p) {
        List<T> filteredList = new ArrayList<>();

        for (T t : basket) {
            if (p.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }


}
