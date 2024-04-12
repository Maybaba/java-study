package day05;

//다른 패키지에 있는 클래스를 로딩할 때 이름을 축약하여 사용합니다.
import day05.juice.*;
//import Day05.fruit.Apple;
//import Day05.juice.Banana;
//import Day05.juice.Peach;

public class PackageMain {
    public static void main(String[] args) {

        day05.fruit.Apple a1 = new day05.fruit.Apple(); //fruit
        Apple a2 = new Apple(); //juice
        new Banana();
        new Peach();

        java.util.Scanner sc = new java.util.Scanner(System.in);
    }
}
