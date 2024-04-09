package day02;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        int [] arr = {10, 50, 90, 100, 150};
        int newNumber = 66; //66을 배열의 중간에 넣고 싶어!
        int targetIndex = 2; //2번 인덱스에 넣고 싶어!

        //1. 사이즈가 1개 더 큰 배열 생성
        int[] temp = new int[arr.length + 1];

        //2. 기존 데이터 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        //3. 삽입위치에서 데이터 뒤로 1칸씩 이동
        // ** 이동 순서는 끝에서부터 시작해야 함 **
        //그렇게 안하면 복사순서가 엉킴 직접해보셈
        temp[5] = temp[4];
        temp[targetIndex + 2] = temp[targetIndex +1];
        temp[3] = temp[2];

        for (int i = arr.length; i > targetIndex - 1; i--) {
            temp[i] =  temp[i - 1];
        }

        //4. 새로운 데이터를 타겟 인덱스자리에 복사
        temp[targetIndex] = newNumber;

        //5. 주소값 이전
        arr = temp; temp = null;

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(temp) = " + Arrays.toString(temp));

    }
}
