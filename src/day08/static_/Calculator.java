package day08.static_;

public class Calculator {
    static String color; //계산기 색
    static double pi; //계산기 안에 저장된 원주율

    //원의 넓이를 구하는 메서드 : static으로 공유하기 (데이터를 전체적으로 공유하고 참조할 수 있음)
    static double calcArea(int r) {
        return pi * r * r;
    }

    //계산기에 색칠하는 메서드
    void paint(String color) {
        this.color = color;
    }
}
