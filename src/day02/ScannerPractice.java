package day02;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //상품 재고 총액 구하기
        System.out.println("****상품 재고 총액 구하기****");
        //키보드 입력받기
        Scanner scan = new Scanner(System.in);
        System.out.printf("상품의 가격 : ");
        int price = Integer.parseInt(scan.nextLine()); //string type to int type
        System.out.println("price = " + price);
        System.out.printf("상품의 수량 : ");
        int counts = Integer.parseInt(scan.nextLine());
        System.out.println("counts = " + counts);

        int total = price * counts;
//        System.out.println("상품 재고 총액 = " + total + "won");
        System.out.printf("상품 재고 총액 = %d원\n", total);
    }
}
