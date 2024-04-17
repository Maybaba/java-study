package day07.inherit.practice;

public class ElectronicProduct extends Object{
    //field
    String productName;
    double price; // -> double : 문자열 %f 로 받음
    String manufacturer;

    public void displayInfo() {
        System.out.printf("상품명 : %s, 가격 : %.0f원, 제조사: %s\n", this.productName, this.price, this.manufacturer);
//        System.out.println(productName);
//        System.out.println("가격 : " + price);
//        System.out.println("제조사 : " + manufacturer);
    }
}
