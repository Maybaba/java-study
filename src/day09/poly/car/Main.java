package day09.poly.car;

import day07.modi.pac2.C;

public class Main {
    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Car sonata3 = new Sonata();

//        Sonata[] sArr = {sonata1, sonata2, sonata3};
//        for (Sonata sonata : sArr) {
//            sonata.accelerate();
//        }

        Car tucson1 = new Tucson();
        Car tucson2 = new Tucson();

//        Tucson[] tArr = {tucson1, tucson2, new Tucson()};
//        for (Tucson tucson : tArr) {
//            tucson.accelerate();
//        }

        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();

        //다형성을 통해 이종모음 배열을 구현할 수 있음
        Car[] cArr = {sonata1, tucson1, mustang1, mustang2};
        for (Car car : cArr) {
            car.accelerate();
        }

    Object [] sArr = {"abc", "dsd", 100, false, new Tucson()}; //ㅎㄷㄷ...

        System.out.println("=================");
        Driver driver = new Driver();
        driver.drive(new Tucson());
        
        Car mySonata = new Sonata();
        mySonata.accelerate();
//        mySonata.joinSonataClub();
        
        Car[]cars = new Car[3];
        cars[0] = mySonata;

        System.out.println("======================");
        
        CarShop shop = new CarShop();

        double x = 10;
        int y = (int)x;

        //객체타입에서 다운캐스팅의 전제조건 : 반드시 상속관계가 있어야 하며
        //자식객체가 부모타입으로 업캐스팅 된 것만 내릴 수 있음
        //즉 부모객체를 자식타입으로 내릴 수는 없다
        Car car = (Sonata)shop.exportCar(6000);
        //리턴값이 업캐스팅 된 값
        //car 부모 타입으로 업캐스팅 되었음.
        car.accelerate();
//        car.joinSonataClub();

        System.out.println("===============");

        // 부모타입을 강제로 자식타입으로 캐스팅 할 수 없다
        // Sonata ccc = (Sonata)new Car();
        //상속관계가 있어야 타입캐스팅이 가능하다.
//        Mustang mmm = (Sonata) new Mustang();

        //부모타입으로 업캐스팅 한 것을 다시 다운캐스팅 할 수 있다.
        Car ttt = new Tucson();
        Tucson tts = (Tucson) ttt;
    }
}
