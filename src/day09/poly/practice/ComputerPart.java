package day09.poly.practice;

public class ComputerPart {
    //field
    String partName;
    int partPrice;
    //method
    public ComputerPart (String partName, int partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;
    }
    public void describePart() {
        System.out.println("Part : " + partName + ", price :" + partPrice);
    }

}
