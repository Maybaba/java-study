package day09.poly.practice;

public class Processor extends ComputerPart{

    public Processor(String name, int price) {
        super(name, price);
    }

    //method
    @Override
    public void describePart() {
//        System.out.println("Processor: " + this.partName + ", Price: " + this.partPrice);
        super.describePart();
    }
}
