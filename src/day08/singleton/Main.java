package day08.singleton;

public class Main {
    public static void main(String[] args) {
        MyPet m1 = MyPet.getInstance(); //주소값이 똑같다. 참조하는 객체가 하나만 있고, 모두 같은 값을 참조하기 때문
        MyPet m2 = MyPet.getInstance();
        MyPet m3 = MyPet.getInstance();

        //원하는 객체를 무한히 생성할 수 있다.

        System.out.println("m3 = " + m3);
        System.out.println("m2 = " + m2);
        System.out.println("m1 = " + m1);

        m1.setName("초코");

        m1.introduce();
        m2.introduce();
        m3.introduce();
    }
}
