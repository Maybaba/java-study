package day01;

public class DataType {

    public static void main(String[] args) {
        //기본(원시)타입은 용량이 정해져 있음
        //String과 같은 객체(클래스)타입은 용량이 정해져 있지 않음 (기본타입 노노)

        //1byte = 8bit
        //1bit == 숫자 0이나 1을 저장할 수 있음
        // 0 1111111 =>  64 + 32 + 16 + 8 + 4 + 2 + 1 = 127
        byte a = 127;       //1byte 영상스트리밍할 때 끊기지 않기 위해 사용
        short b = 32767;    //2byte 음수도 표현해서 문자형 char 의 범위의 절반 정도임
        int c = 2147483647;  //4byte
        long d = 2147483647234224424L; //8byte : 900경
        // 숫자가 저장되는 공간의 사이즈를 늘리기 -> L
        
        System.out.println(d);
        
        float e = 3.143434324323424F;  // 실수 4byte
        double f = 3.142342343223423424244;  // 실수 8byte
        double g = 100;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        boolean flag1 = false;
        boolean flag2 = 10 > 5; //논리값 저장하기 boolean
        //데이터 타입 자동으로 알려주는 cmd + option + value
        //정수부, 실수부 따로 저장하는 방식이 있음

        double random = Math.random();


        int i = 200;
        System.out.println(i + a);
        System.out.println(b * i);

        //문자형 char : 2byte 0~65536 음수를 표현할 필요가 없음 : 한글자를 표현하는데 사용
        char text = 65534; // 2byte 아스키코드에 할당된 문자들을 표현
        System.out.println("text =" +text);

        //문자열 : 문자 배열
       char[] hello ={'안', '녕', '하', '세', '요'};
        System.out.println("hello =" +new String(hello));

        String hello2 = "안녕하세요";

    }
}
