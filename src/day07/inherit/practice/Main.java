package day07.inherit.practice;

public class Main { //변수이름수정할 때 fn shift f6

    public static void main(String[] args) {

        Television tv = new Television("Samsung TV", 2000000, "Samsung", 55);
        SmartPhone sm = new SmartPhone("iPhone 13", 890000, "Apple", 256);

                System.out.println("TV Info:");
                tv.displayInfo();

                System.out.println("\nSmartphone Info:");
                sm.displayInfo();
    }
}
