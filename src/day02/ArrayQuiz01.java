package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {
        //먹고싶은음식 입력, 그만이라 하면 음식리스트 배열로 나타내기
//        자바 문자열 비교시 문자열1 == 문자열2 로 하시먼 안되는걸 말씀안드렸네요
//        newFood.equals("그만")
        System.out.println("#먹고싶은 음식을 입력해주세요");
        System.out.println("#그만 입력하고싶으면 <그만> 이라고 입력해 주세요");

        // 음식 리스트 키보드로 입력받기
        Scanner scan = new Scanner(System.in);

        //음식 리스트 만들기
        //입력값을 받을 배열의 주소값 생성
        String[] foodlist = new String[] {}; //{} 으로 생략 가능


        while (true) {
            //음식 1개를 저장하는 코드
            System.out.print(">>>>");
            String newFood = scan.nextLine();

            // food에 그만이라고 입력받았을 경우
            if (newFood.equals("그만")) break;


            // 입력받은 newfood르 foodlist 배열에 추가하기
            //기존 사이즈보다 1개가 더 큰 새로운 배열 생성
            String[] temp = new String[foodlist.length + 1];

            //기존 데이터를 새로운 배열에 복사하기
            for (int i = 0; i < foodlist.length; i++) {
               //좌항 : 영역 우항 : 값
                temp[i] = foodlist[i];
            }
            //새 배열의 끝 인덱스에 넣을 데이터 추가하기
            temp[temp.length -1] = newFood;

            //temp가 관리하는 새 배열을 기존 주소값으로 이전
            foodlist = temp;
            temp = null;
        }
        System.out.println("foodlist = " + Arrays.toString(foodlist));
        return;
    }

}





            /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드

            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로

        */