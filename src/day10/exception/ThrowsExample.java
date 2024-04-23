package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {
    //정수를 입력받아 리턴
    public int inputNumber() throws InputMismatchException { //해당 에러가 날 수 있음을 표시, 에러가 나면 사용자에게 catch하라고 안내 (?)
        Scanner s = new Scanner((System.in));
        //예외처리를 사용자에게 넘겨줄 수 있다.
        int num = s.nextInt();
        return num;


        //문자열 정수로 변환
//        public int convert(String str) throws NumberFormatException {
//            int n = Integer.parseInt("550");
//            return n;
//        }
    }
}
