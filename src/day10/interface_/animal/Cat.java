package day10.interface_.animal;

public class Cat extends Animal implements Pet, Aggressive{
    @Override
    public void hunt(Pet pet) {

    }

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }
}
