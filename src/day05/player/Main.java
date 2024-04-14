package day05.player;

public class Main {
    public static void main(String[] args) {

        Player parking = new Player("주차왕파킹");
        Player insultKing = new Player("욕설왕퍼킹");
        //두개의 메모리 주소가 다르게 나온다.
       // parking = day05.player.Player@566776ad
        // insultKing = day05.player.Player@6108b2d7

        System.out.println("parking = " + parking);
        System.out.println("insultKing = " + insultKing);

        insultKing.attack(parking);
        insultKing.attack(parking);
        insultKing.attack(parking);
        insultKing.attack(parking);
        insultKing.attack(parking);
        insultKing.attack(parking);

        Player p1 = new Player("먑냐뱝");
        //생성자는 동시호출 할 수 없다.. this를 통해서 동시호출 할수도 있다.
    }
}
