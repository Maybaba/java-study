package day09.poly.practice;

import day07.modi.pac2.C;

public class HardDrive extends ComputerPart {
    public HardDrive(String name, int price) {
        super(name, price);
    }

    @Override
    public void describePart() {
        System.out.println("HardDrive : " + this.partName + ", Price: " + this.partPrice);
    }
}
