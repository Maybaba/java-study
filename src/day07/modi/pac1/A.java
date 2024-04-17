package day07.modi.pac1;

public class A {

    // 필드 (속성)
    public int f1;
    int f2; // default
    private int f3;

    // 메서드
    public void m1() {}
    void m2() {}  // default
    private void m3() {}

    // 생성자
    public A(int a) {}
    A(double b) {}
    private A(boolean c) {}

    void test() {
        this.f2 = 10;
        this.f1 = 10;
        this.f3 = 10;

        m1();
        m2();
        m3();

        new A(10); // public
        new A(5.5); // default
        new A(false); // private
    }

}
