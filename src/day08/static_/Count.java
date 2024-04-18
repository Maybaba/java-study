package day08.static_;

public class Count {

    //사용제한자 usage modifier
    static int x; //정적 필드 static field : 모든 객체가 공유
    int y; //인스턴스 필드 instance field : 각 개체별로 따로 관리
    //default 0

    //정적메서드 : 모든 객체가 공유하며 객체 생성없이 접근 가능
    static void m1() {
        System.out.println("static method call");
        System.out.println("x (static) = " + x);

        //static 메서드 내부는 instance 필드를 직접 참조 불가
        //static은 객체생성없이 호출되므로 this를 가질 수 없기 때문에
        //static에서 값을 참조하려면 정확한 객체가 필요하다
//        Count c3 = new Count();
//        System.out.println("y (instance) = " + c3.y);
        //그렇지 않으면 어떤 객체를 참조해서 값을 불러와야 할 지 정해지지 않았다.
        //몰라서 못부름!
//        this.m2(); // 마찬가지로, 누구의 m2인지 this 를 사용하면 정확한 대상을 알 수 없음
//        m1();
    }

    //인스턴스 메서드 : 각 객체별로 따로 실행됨
    void m2() {
        System.out.println("instance method call");
        System.out.println("x (static) = " + x);
        System.out.println("y (instance) = " + y);
        m1();
    }
}
