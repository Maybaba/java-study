package day10.interface_.animal;

public class BullDog extends Animal implements Pet {
    @Override
    public void handle() {
        this.age = 10;

    }

    @Override
    public boolean inject() {
        return false;
    }
}