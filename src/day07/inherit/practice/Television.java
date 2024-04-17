package day07.inherit.practice;


public class Television extends ElectronicProduct {

    int screensize;

    //생성자에 값 초기화
    public Television(String productName, double price, String manufacturer, int screensize) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.screensize = screensize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Screen size : %d GB\n", this.screensize );
    }
}
