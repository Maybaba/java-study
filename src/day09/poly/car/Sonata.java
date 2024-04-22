package day09.poly.car;

public class Sonata implements Car {
    @Override
    public void accelerate() {
        System.out.println("소나타가 달립니다.");
    }

    @Override
    public void decrease() {

    }

    @Override
    public void changeGear() {

    }

    //소나타 동호회 가입 기능
    public void joinSonataClub() {
        System.out.println("소나타 동호회에 가입합니다");
    }



}
