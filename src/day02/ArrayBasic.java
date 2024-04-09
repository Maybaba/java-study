package day02;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // 원래 배열의 특징
        // 1. 동종 모음 구조 homoginiox collection??? :
        // 같은 타입의 데이터만 모아서 배열에 담을 수 있음
        // 2. 크기가 불변함 : 크기를 동적으로 늘이거나 줄일 수 없음

        //배열의 생성 순서
        //1. 배열 변수 선언
        int [] numbers; //numbers - 정수배열타입, 정수타입아님

        //2. 배열의 객체를 생성
        numbers = new int[5]; //배열의 길이 설정
        System.out.println("numbers = " + numbers); //stack에 많은 값을 넣을 수
        //없어서 배열의 주소(포인터)를 저장한다. numbers = [I@566776ad
        //주소적으로 직렬로 정렬됨

        //3. value initiate
        numbers [0] = 50;
        numbers [1] = 66;
        numbers [2] = (int)99.3;
        numbers [3] = numbers[0] + 20;
        numbers [4] = 100;
//        numbers [5] = 10; //배열의 길이를 넘어서서
//        ArrayIndexOutOfBoundsException 에러

        //배열의 길이 알기
        System.out.println(numbers.length);

        //배열의 순회
        System.out.println("=======================");

        for (int i = 0; i < numbers.length ; i++) {
            System.out.printf("numbers[%d] : %d\n", i, numbers[i]);
        }
        System.out.println("============================");

        //배열 순회 foreach (fof of 와 같음) shortcut : iter
        for (int n : numbers) {
            System.out.println("n = " + n);
        }
        //배열 내부 간결하게 출력
        System.out.println(Arrays.toString(numbers));

        //배열선언과 객체생성 한번에 하기
        int[] pointList = new int[] {10, 20, 30, 40};
        System.out.println(Arrays.toString((pointList)));
        
        //배열변수 선언과 동시에 값 초기화한다면
        //newType[] 생략가능
        String[] pets = new String[] {"멍멍", "짹짹","콩콩"};
        System.out.println(Arrays.toString((pets)));

        //배ㅕ열을 생성만하고 값을 넣지 않음
        //각 타입의 기본값으로 미리 값을 넣어놓음
        //기본값 : 정수0, 실수 0.0, 논리 false, 문자(char) : 공백, 기타 : null
        byte[] bArr = new byte[3];
        double[] dArr = new double[6];
        boolean[] blArr = new boolean[4];
        String[] sArr = new String[5]; //기타. char type

        System.out.println(Arrays.toString((bArr)));
        System.out.println(Arrays.toString((dArr)));
        System.out.println(Arrays.toString((blArr)));
        System.out.println(Arrays.toString((sArr)));
        System.out.println(bArr.length);
    }

    //이건 무슨 문법?
    static int[] getNumbers() {
        return new int[] {50, 60, 70};
    }
}
