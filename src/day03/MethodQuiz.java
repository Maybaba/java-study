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
        int index = -1; //default : falsy
        for (int i = 0; i <foods.length ; i++) {
            if(foodName.equals(foods[i])) {
                index = i;
                break;
            }
        }
        return index; //return 을 해야지 index 값을 반환해서
        //sout이 그 값을 참조할 수 있다.
    }

    static void remove(String deleteFood) {
        //입력받은 값이 배열에 있는지 확인하기
        int index = indexOf(deleteFood);
        if (index == -1) return;
        // duplicate the array that delete inputted parameter
        for (int i = index; i < foods.length -1; i++) {
            foods[i] = foods[i + 1];
        }
        // create new array 'temporary' what I want to input deleted array using above foods array
        String [] temp = new String[foods.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
        temp = null;
    }

    static boolean include (String foodName) {
        //if foods include inputted foodName, return true
        int index = indexOf(foodName);
        if (index <= -1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        remove("김치찌개");
        printFoods();

        boolean flag1 = include("떡볶이");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);
//
//        insert(3, "파인애플");
//
//        printFoods();
//
//        modify(2, "닭갈비");
//        printFoods();

    }
}
