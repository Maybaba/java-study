package day10.interface_;

public interface SmartPhone { //다중 상속 처리기능 있음
    //interface 기본적으로 추상화 상태이기 때문에 추상화 키워드를 사용하지 않아도 됨

    //interface 처음 설계부터 객체를 만들지 않을 것을 가정했으므로
    //생성자 및 필드를 선언할 수 없음. 상수는 선언 가능
    int AGE = 10;
    public static final int age = 10; //static 은 객체와 별도이다. 공유되는 데이터 이기 때문이다.
    //static 접근하는 것과 똑같이 접근 가능

    //스펙 보여주기 기능
    void information();

    //충전 기능
    void charge();

    //카메라 기능
    void camera();
}
