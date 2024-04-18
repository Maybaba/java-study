package day08.super_;

public class Parent extends Object { //상위클래스
    int a; //field - 객체의 속성 - 성질, 데이터, 명사
    double b; //field
    protected Parent() { //constructor - 새로운 객체 생성 - field값 initialize
        super();
        System.out.println("Parent class 생성자 호출");
        this.a = 41;
        this.b = 20.5;

    }
    void superMethod() { //method - 행위, 행동, 동사 - return type needed
        System.out.println("Parent a = " + this.a);
        System.out.println("Parent b = " + this.b);

    }
}
