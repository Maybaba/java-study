package day08.static_;

public class Person {

    String name;
    int age;
    static String nation; //국가

    static {
        nation = "대한민국";
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.nation = "대한민국";
    }
}
