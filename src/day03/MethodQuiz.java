package day03;

import java.util.Arrays;

public class MethodQuiz {
    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};

    //메서드는 반드시 클래스 블록 내부, 다른 메서드 외부에 만들어야 함
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static void push(String foodName) { //새로 받는 param은 타입정의

        //새로운 배열 생성
        String[] temp = new String[foods.length +1];

        //기존 데이터를 새로운 배열에 복사
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        //새 배열의 끝인덱스에 넣을 데이터 추가하기
        temp[temp.length-1] = foodName;

        //주소값 재설정
        foods = temp;
        temp = null;
    }

    static int indexOf(String foodName) { //새로 받는 param은 타입 정의
        //foodName이 어느 index에 있는지 확인하기
        int index = -1; //기본값 : falsy
        for (int i = 0; i <foods.length ; i++) {
            if(foodName.equals(foods[i])) {
                index = i;
                break;
            }
        }
        return index; //return 을 해야지 index 값을 반환해서
        //sout이 그 값을 참조할 수 있다.
    }

    static void remove(String foodName) {
        //새로운 배열을 만든 뒤

        //새로운 배열에서 삭제한다.
    }

    public static void main(String[] args) {

        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);
//
        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);
//
        remove("치킨");
        printFoods();
//
//
//        boolean flag1 = include("파스타");
//        System.out.println("flag1 = " + flag1);
//
//        boolean flag2 = include("떡라면");
//        System.out.println("flag2 = " + flag2);
//
//        insert(3, "파인애플");
//
//        printFoods();
//
//        modify(2, "닭갈비");
//        printFoods();

    }
}
