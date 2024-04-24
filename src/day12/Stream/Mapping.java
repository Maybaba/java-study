package day12.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static day12.Stream.Menu.menuList;

//map : 리스트에서 원하는 데이터만 추출
// original : [{}, {}, {}]
//filter : [{}, {}] 형태는 같음
//mapping : [5, 4, 2] 데이터 중 공통으로 포함하는 것 추출
//
public class Mapping {

    public static void main(String[] args) {

        //원본 데이터에서 요리 이름 추출
        //제너릭으로 타입 변환 String type
        List<String> nameList = menuList
                .stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

        System.out.println("nameList = " + nameList);

        System.out.println("=======================");

        List<String> words = List.of("safari", "c", "d", "e");

        List<Integer> collected = words.stream()
                .map(w -> w.length())
                .collect(Collectors.toList());

        System.out.println("collected = " + collected);

        // 문자열에서 해당 위치만 추출
        List<Character> characterList = words.stream()
                .map(w -> w.charAt(0)) //문자열에서 해당위치 글자 추출
        .collect(Collectors.toList());
        System.out.println("characterList = " + characterList);

        System.out.println("=========================");

        //메뉴 목록에서 메뉴 이름과 칼로리를 추출해서
        //새로운 객체에 포장하고 싶음
        /* 아래의 배열 중 name만 추출하고 싶을 때
        const menuList = [
            {
                name : 'pork',
                cal : 400,
                ingredient : asfdfs,
            }
       ]
         */
        //두개의 필드를 갖고있는 클래스만 새로 만든다. SimpleDish
        //생성자한테 데이터를 통째로 주고, 그 후 내가 원하는 데이터대로 뽑게끔 한다.
        List<SimpleDish> simpleDishList = menuList
                .stream()
                .map(dish -> new SimpleDish(dish))
                .collect(Collectors.toList());

        simpleDishList.forEach(sd -> System.out.println(sd));

    }
}
