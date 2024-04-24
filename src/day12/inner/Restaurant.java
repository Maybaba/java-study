package day12.inner;

@FunctionalInterface //람다를 사용할 수 있는 인터페이스인지 점검
public interface Restaurant {

    void cook();
    //void reserve(); //overriding 안하면 화남. 강제임!
}
