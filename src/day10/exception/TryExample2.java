package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {
            System.out.print("n1 : ");
            int n1 = Integer.parseInt(s.next()); // NumberFormatException -> does not input Integer

            System.out.print("n2 : ");
            int n2 = s.nextInt(); // InputMisMatchException

            int result = n2 / n1; // ArithmeticException
            System.out.println("result = \n" + result);

            System.out.println("프로그램 정상 종료");
            // multi catch
        } catch (InputMismatchException e) {
            System.out.println("올바른 수 (정수)를 입력해 주세요");
//            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            System.out.println("문자로 변환할 수 없는 숫자입니다. ");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. ");
            e.printStackTrace(); // 에러 로그를 띄움 -> 개발 시 유용
        }
    }
}
