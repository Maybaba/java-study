package day10.interface_.animal;

public class Shark extends Animal implements Aggressive { //다중상속이 안되는 문제 해결
    public void handle() {
        int age = 12;
    }
    public boolean inject() {
        return false;
    }

    @Override
    public void hunt(Pet pet) {

    }
    //사냥 기능

    //성격 : 난폭
}
