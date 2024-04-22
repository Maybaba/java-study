package day10.abs;

public class Main {
    public static void main(String[] args) {

        // Pet pet1 = new Pet(); //abstract 명령어로 구체화 할 수 없도록 instance 생성을 막아준다.

        // 필드명이 같음, 기능이 같음, 하지만 메서드 이름이 다를 때
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.eat();
        myCat.sleep();
        myDog.walk();
        // myDog.takeNap(); -> 부모클래스 overriding -> 추상화

        Pet[] petList = {myCat, myDog};
        for (Pet pet : petList) {
            pet.eat(); // method가 기능은 같으나 메소드 이름이 모두 다르기 때문에 ... for-if문으로 돌리거나
            // 부모클래스를 만들어서 overriding을 하여 추상화를 활용한다.
        }



    }
}
