package day08.final_;

class Child extends Parent {
    @Override
    void sing() {
        System.out.println("over-riding check for sing");
    }
//    @Override
//   public final void dance() {
//        System.out.println("over-riding check for dance");
//    }

}
public class Parent {
    void sing() {
        System.out.println("노래");
    }
   final void dance() {
        System.out.println("춤춤");
    }
}
//there are too many functoins in java that makes diverse logic

