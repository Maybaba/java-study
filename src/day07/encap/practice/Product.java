package day07.encap.practice;

public class Product {
    private String name; //접근 제한자는 필드에만 적용 가능하다
    private int price;
    private int stock;

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
        public void reduceStock(int quantity) {
        if(stock > quantity) {
            stock -= quantity;
        } else {
            System.out.println("요청한 수량이 재고보다 많습니다."); }
    }

}
