package day08.protec.pac1;

public class B {
    void test() {
        A a = new A(); //public call
        new A(10); //protected
        new A(3.3); //default

        a.f1 = 10; a.f2 = 30;
        a.m1(); a.m2();
    }
}
