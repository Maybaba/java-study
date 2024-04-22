package day10.abs;

abstract public class Pet {
    //class가 abstract가 아니면 method에서도 사용 불가
    String name;
    int age;
    String kind;

    public Pet() {
        super();
    } // 엥 생성자를 왜 만들 수 있지?

    public void setPet(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    } //자식클래스를 통한 새로운 객체생성은 가능하다 => 생성자를 만들어놔야 한다.

    //필요에 따른 오버라이딩
    public void walk() {
        System.out.println("over-riding depends on needs");
    }

    //강제하는 기능은 추상화
    public abstract void eat();
    public abstract void sleep();
    //{
    //   System.out.println("부모클래스 sleep 입니다. "); //어차피 overriding 하는 자식 쪽에서
    // 기능을 다시 만들기 때문에 abstract를 활용한다.
    // }
}
// 추상 메서드는 본문이 없는 껍데기 역할
// 자식들에게 이름을 통일시키기 위한 장치로만 사용
// 추상메서드는 추상 클래스 안에서만 선언 가능
// 다만 추상 클래스 내부에는 추상메서드 이외에 모든 메서드 선언 가능
