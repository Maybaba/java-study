package day09.poly.casting;

public class Main {
    public static void main(String[] args) {

       Child child = new Child();
       child.c1 = 100;
        child.p1 = 100;

        child.method1();
        child.method2();

        Parent parent = new Parent();
        parent.p1 = 500;
        parent.method1();

        Child castingChild = new Child();

        castingChild.p1 = 100;
        castingChild.c1 = 300;
        castingChild.method1();
        castingChild.method2();

        //업캐스팅을 할때는 한번에 선언하지 말고 원하는 값을 골라서 재 업캐스팅(?)
        Parent[] pArr = {castingChild};
        Parent pp = castingChild;

    }
}
