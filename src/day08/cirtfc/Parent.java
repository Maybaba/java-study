package day08.cirtfc;

public class Parent {
    public String nation;
    public Parent() { //constructor
        this("대한민국");
        System.out.println("Parent() call!");
    }
    public Parent(String nation) { //method
        super();
        this.nation = nation;
        System.out.println("Parent(String) call!");
    }
}
