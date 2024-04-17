package day07.modi.pac2;

import day07.modi.pac1.A;
import day07.modi.pac1.B;

public class C {

    public int y1;
    int y2;
    private int y3;
    void test() {
        A a = new A(100); //public // if package is diff, need to import
//        new A(3.14); //default
//        new A(false); //privite

        a.f1 = 10;
//        a.f2 = 10;
//        a.f3 = 30;

        a.m1();
//        a.m2();
//        a.m3();
    }
}
