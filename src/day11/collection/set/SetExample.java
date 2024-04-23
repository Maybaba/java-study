package day11.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SetExample {
    public static void main(String[] args) {
        //중복저장 허용x, 순서가 없음, 비교적 빠른 저장속도
        Set<String> set = new HashSet<>();

        boolean flag1 = set.add("김말이");
        set.add("김말이");
        set.add("김말이");
        boolean flag2 = set.add("김말이");
        set.add("김말이");

        System.out.println("set = " + set);

        //iterable
        //탐색 시 개별탐색 불가, 전체탐색 가능
        for (Object s : new HashSet<>()) {
            System.out.println("s = " + s);
        }

        set.remove("김말이");
        System.out.println("set = " + set);

        //set은 데이터 중복을 바르게 제거할 때 사용
        List<Integer> numbers = List.of(3,3,3,3,4,5,6,1,1,3,2,5,7);
        //set으로 변환
        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);

        //list로 다시 변환
        numbers = new ArrayList<>(numberSet);
        System.out.println("numbers = " + numbers);

        //map 변화


    }
}
