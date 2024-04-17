package day07.inherit.practice;

public class SmartPhone extends ElectronicProduct {
    int storageCapacity;

    //생성자
    public SmartPhone(String productName, double price, String manufacturer, int storageCapacity) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.storageCapacity = storageCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Screen size : %d inches\n", this.storageCapacity );
    }
}
