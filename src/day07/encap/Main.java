package day07.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");

       // myCar.model = "페라리 467"; // -> 데이터 변경을 막기

        myCar.startStop(); //이 코드 안에서 모든 코드를 실행하게끔 개선

        // myCar.start = false; //직접 기능 접근 가능 -> 은닉화로 막기

        //속도를 0 ~ 200에서만 제한하고 싶음 -> 함수에서만 제한가능한 setter method
        myCar.setSpeed(100);

        //private 으로 데이터를 가져오기만 하는 getter method 사용하여야 확인가능
//        System.out.println("현재 속도 : " + myCar.speed + "km/h");
        System.out.println("현재 속도 : " + myCar.getSpeed() + "km/h");

        //변속모드
        myCar.setMode('X');
        System.out.println("현재 변속 모드 :" + myCar.getMode());

        // 캡슐화 : 아래의 코드를 호출할 수 없게끔 기능을 private 처리 한다.
//        myCar.injectGasoline();
//        myCar.moveEngineOil();
//        myCar.moveCylinder();

    }
}
