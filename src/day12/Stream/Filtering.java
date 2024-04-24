package day12.Stream;

import java.util.List;
import static day12.Stream.Menu.menuList;
import static java.util.stream.Collectors.toList;

public class Filtering {
    public static void main(String[] args) {

        //요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> dishList = menuList.stream()
                .filter(dish -> dish.isVegeterian())
                .collect(toList());

        dishList.forEach(dish -> {
            System.out.println(dish.getName());
            });

        System.out.println("================");
        //요리 메뉴 중 육류이면서 600미만인 요리 필터링
        menuList
                .stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT
                        && dish.getCal() < 600)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("====================");

        //칼로리가 300이상 3개만 필터
        menuList
                .stream()
                .filter(d -> d.getCal() > 300)
                .limit(3) //앞에서부터 3개 추출
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("====================");

        //위의 처음 두개 제끼고 필터링
        menuList.stream()
        .filter(d -> d.getCal() > 300)
                .skip(2) //앞에서부터 3개 추출
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("====================");

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        //even
         numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct() //중복제거
                .collect(toList());

        System.out.println(numbers);


        }
    }

