package day10.exception;

public class TryExample1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 0;

        System.out.println("나눗셈 시작");

        //catch me if you can
        //비정상종료하지 않는 방향으로 진행
        try {
            int result = n1 / n2; // 예외 발생 가능성이 있는 코드 아 키보드 느낌 너무 좋다 헤헤 >< 김뭐튀
            System.out.printf("%d / %d = %d\n", n1, n2, result);
        } catch (Exception e) {
            //예외가 발생했을 경우 프로그램 튕기는 대신 실행할 코드
            System.out.println("0 으로 나눌 수 없습니다. ");
        }

        System.out.println("나눗셈 정상 종료");
    }
}
