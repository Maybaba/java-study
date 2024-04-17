package day07.player;

import java.util.Scanner;

//상위 클래스 super class
//공통 속성(field)과 기능(method)을 가진 부모 클래스
//다중상속 -> java는 지원하지 않는다. -> 죽음의 다이아몬드
//모든 class의 최종 조상은 Object 로 이어져 있다.
public class Player extends Object{

    String nickname;
    int level;
    int hp;

    //현재 캐릭터 정보를 출력
    public void showStatus() {
        System.out.println("\n===============character's Info===============");
        System.out.println("#name : " +this.nickname);
        System.out.println("#level : " +this.level);
        System.out.println("#hp : " +this.hp);
    }
}
