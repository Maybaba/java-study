package day11.api.lang;

public class Wrapper {
    private int number1; // default value : 0
    private Integer number2; // default value : null
    public static void main(String[] args) {

        //byte, short, int, long, boolean, float, double, char -> save memory at heap area
        //primitive type 기본 타입

        //Wrapper type : expression type to object
        //Byte, Short, Integer, Long, Boolean, Float, Double, Character
        Integer a = new Integer(10); //completely same as "int a = 10;"
        // go to Object class : 0 !!!!
    }
}
