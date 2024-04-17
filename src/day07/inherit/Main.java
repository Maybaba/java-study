package day07.inherit;

public class Main {
    public static void main(String[] args) {
       Calculator cal = new Calculator();
       Computer com = new Computer();

        //상속 때문에 둘의 차이가 없다.
        System.out.println("계산기로 구한 원의 넓이 " + cal.calcAreaCircle(5));
        System.out.println("컴퓨터로 구한 원의 넓이 " + com.calcAreaCircle(5));

    }
}
