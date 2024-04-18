package day08.static_;

import util.SimpleInput;

import static day08.static_.Count.m1;
import static java.lang.System.*;
import static util.SimpleInput.input; //input method 가져오기

public class Main {
    public static void main(String[] args) {

        //static 데이터는 객체 생성 없이 접근 가능
        Count.x = 20;

        m1();
        Count c = new Count();
        c.m2();

        Math.random();

        Count c1 = new Count();
        Count c2 = new Count();
        m1();
        c1.m2();

        c1.y = 10;
        c2.y = 20;

        Count.x = 50;
        Count.x = 99;

        out.println("c1.x = " + c1.x); //50
        out.println("c2.x = " + c2.x); //99
        out.println("===========================");
        out.println("c1.y = " + c1.y); //10
        out.println("c2.y = " + c2.y); //20

        Calculator redCal = new Calculator();
        Calculator blueCal = new Calculator();

        redCal.paint("빨강");
        blueCal.paint("파랑");

//        String name = input("이름 :");

//        double ramdom = ramdom();

        out.println();

        m1();

        out.println("========================");

        out.println("국가 : " + Person.nation);
        //person에 접근 가능 하다.
        //하지만 nation 값은 초기화 전이므로 값이 없다.

        //정적 초기화자 static initializer
        //static field의 생성자와 같은 역할 (static field initiate)
        Person gap = new Person("갑", 20);
        out.println(gap.name);
        out.println(gap.age);
        out.println(gap.nation);

    }
}
