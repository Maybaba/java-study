package day02;

public class RandomExample {
    public static void main(String[] args) {


    //연산자 우선순위
    //단항(++, --, !) > 이항(*, /, %...) > 삼항(? :) > 대입 (=)
    int a = 10;
    int b = ++a - 10 * 3;
    /*
    난수만들기 (RandomNumber)
     */
//    double rn = Math.floor(Math.random() *10) + 1; 에러가 난다

    //Math.random => 0.0 <= ~ < 1.0
    //Math.random * 10 => 1.0 <= ~ < 10.0
    //(int)Math.random => 0 <= ~ <1
    int rn = (int)(Math.random() * 10) + 1; //int 로 변환하면 소수점 날라감
    System.out.println("rn = " + rn);
    }
}
