package day07.modi.pac1;

import day07.modi.pac2.C;

public class B {

    public int z1;
    int z2;
    private int z3;
    void test () {
        A a1 = new A(50); //public
        A a2 = new A(5.5); //default
//        new A(true); //privite

        a1.f1 = 20; //public
        a1.f2 = 50; // default
//        a1.f3 = 50; //privite

        a1.m1();
        a1.m2();
//        a1.m3();

        C c = new C(); //op + sh + enter : import
        c.y1 = 10;


    }
}

