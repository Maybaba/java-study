package day08.super_;

public class Child extends Parent{
//    int a;
//    double b;
    boolean c;

    Child() { //객체를 만드려면 생성자를 만들어야 함.
        //super() 메소드가 없으면 부모의 주소값을 참조할 수 없음
        this(100);
        System.out.println("Child class 생성자 호출");
        this.c = true;
    }
    Child(int x) {
        super(); //첫 줄에 method가 없을 경우 자동으로 삽입되는 키워드로, 부모클래스를 호출함.
        System.out.println("Child class 두번째 생성자 호출");
    }
    void childMethod() {
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
        System.out.println("c = " + this.c);
    }
}
