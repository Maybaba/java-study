package day02;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        //배열에서 원하는 위치의 값 (5) 삭제하기
        int [] numbers = {1, 3, 5, 7, 9, 11};

        int targetIndex = 2;

        //1. 3번인덱스의 5를 2번인덱스에 다시 값을 넣는다.
        numbers[2] = numbers[3];
        // 2. 하나씩 옮겨가며 복제한다.
        numbers[3] = numbers[4];
        numbers[4] = numbers[5];

//        for (int i = targetIndex; i < numbers.length -1; i++) {
//            numbers[i] = numbers[i + 1];
//        }

        int[] temp = new int[numbers.length  - 1];
        for (int i = 0; i < numbers.length -1 ; i++) {
            temp[i] = numbers[i];
        }

        numbers = temp;

        System.out.println(Arrays.toString(numbers));

    }
}
