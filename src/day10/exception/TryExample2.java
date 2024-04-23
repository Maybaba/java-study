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

            //null을 예상할 수 없을 때
//            String s = null;
//            s.equals("hello");

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
        } catch (Exception e) {
            System.out.println("알 수 없는 에러입니다. etc... exeption");
        } //thread 방식으로 내려오기 때문에 Exception 이 마지막에 캐치문으로 있어야 한다. 중간에 있으면 걸러내는 의미가 없다.
    }
}
