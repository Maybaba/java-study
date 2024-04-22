package day09.poly.car;

public class Driver {
    public void drive(Car car) {

        // 어떤 클래스가 들어오는지 알 수 있는 방법
        System.out.println(car instanceof Sonata);

        String carName = "";
        if (car instanceof Sonata) {
            carName = "소나타";
        } else if(car instanceof Tucson) {
            carName = "투싼";
        } else if(car instanceof Mustang) {
            carName = "머스탱";
        }

        System.out.println("운전을 시작합니다.");
        car.accelerate();
    }
}
