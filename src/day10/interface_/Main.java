package day10.interface_;

public class Main {
    public static void main(String[] args) {
        //db를 만드는 곳은 티베로 라는 (티맥스소프트) 곳에서 제작
        //오라클 DB 등 여러 회사의 DB를 활용할 때
        //API 마다 함수가 다르니까 인터페이스를 설정해버렸다..
        SmartPhone galaxy = new Galaxy();
        SmartPhone iphone = new Iphone();

        // new SmartPhone(); -> 새로운 객체 생성
    }
}
