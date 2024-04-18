package day08.practice2;

public class Product {

    //product
   private String prodctName; // instance
   private int price; // instance

    //method
    Product (String name, int price) {
        this.prodctName = name;
        this.price = price;
    }
    public void sellProduct() {
        Store.addSale(this.price);

    }
}
