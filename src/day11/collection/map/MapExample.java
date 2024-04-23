package day11.collection.map;

import day09.book.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapExample {
    public static void main(String[] args) {
        //generic 이 두개임
        Map<String, Object> map = new HashMap<>(); //collection 자식 이 아님 ,,,
        //데이터 추가 : put()
        map.put("지갑잔액", 500);
        map.put("좋아하는 책", new Book());
        map.put("오늘저녁메뉴", "김볶밥");

        Map<String, Object> emp = new HashMap<>();
        emp.put("empName", "철철");
        emp.put("emp", "머시 중헌디");
        System.out.println("map = " + map.size());

        //get(key)
        int money = (int)map.get("지갑잔액");
        System.out.println("money = " + money);

        //중복된 키를 저장하면 값이 수정된다.
        map.put("지갑잔액", 999999);
        System.out.println(map);

        //map의 반복문 처리
        for (String s : emp.keySet()) {
            System.out.println("s = " + s);
            System.out.println("value = " + map.get(s)); //js for in 문으로 진행
        }

    }
}
