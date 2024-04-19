package day09.poly.practice;

public class Memory extends ComputerPart{
    public Memory(String name, int price) {
        super(name, price);
    }

    @Override
    public void describePart() {
        System.out.println("Memory: " + this.partName + ", Price: " + this.partPrice);
    }
}
