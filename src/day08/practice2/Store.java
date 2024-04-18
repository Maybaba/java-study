package day08.practice2;

public class Store {
    private static int totalSales; // 총 판매액

    public static int getTotalSales() {
        return totalSales;
    }
    //Store에서 객체생성으로 접근하지 않고 바로 접근할 수 있다.

    public static void addSale(int amount) {
        totalSales += amount;
    }
}
