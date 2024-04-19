package day07.player;

import java.util.Random;

public class Mage extends Player {
    //어떤 필드를 지우려면?? 상위클래스 속성을 활용한다.
    int mana;

    public Mage(String nickname) {
        super(nickname);
//        this.nickname = nickname;
//        this.level = 1;
//        this.hp = 50;
        this.mana = 100;
    }
    //마법사 스킬
    //썬더볼트는 여러 플레이어를 대상으로 공격하는 스킬이다
    //1. 자기 자신이 대상이 되면 자기 자신은 피해를 입지 않는다
    //2. 타겟이 된 대상은 10 ~ 15의 랜덤 피해를 입고 실제 체력이 감소한다.
    public void thunderbolt(Player... targets) {
        for(Player p : targets) {
            //내가 맞았을 때
            if (p == this) {
                p.hp = this.hp; //continue로 무시할 수 있음
            } else {
                int damage =(int) (Math.random() * 6 + 10);
                p.hp -= damage;
                System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                        , p.nickname, damage, p.hp);
            }
        }

    }
    public void showStatus() {
        System.out.println("\n===============character's Info===============");
        super.showStatus(); //-> over-riding으로 부모함수를 가져온다  //showStatus(); //재귀 호출이라 무한루프 돌아서 터진다
        System.out.println("#mana : " +this.mana);
    }

}
