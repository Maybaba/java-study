package day08.protec.pac2;

import day08.protec.pac1.A;

public class D extends A {
    D() {
        super(100); //default does not work even given their parents

        super.f1 = 100; //protected는 상속받으면 접근 가능
//        super.f2 = 100; //그 외엔 접근 불가능
    }

    void test() {
        A a = new A();
//        a.f1 =10; a.f2 =30;
//        a.m1(); a.m2();

    }
}
