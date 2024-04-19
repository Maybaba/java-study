package day07.player;

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior("주주");
        Mage m = new Mage("쇼쇼");
        Hunter h = new Hunter("호호");


        w.showStatus();
        m.showStatus();
        h.showStatus();

        System.out.println("==============");

        //썬더볼트는 여러 플레이어를 대상으로 공격하는 스킬이다
        //1. 자기 자신이 대상이 되면 자기 자신은 피해를 입지 않는다
        //2. 타겟이 된 대상은 10 ~ 15의 랜덤 피해를 입고 실제 체력이 감소한다.
        m.thunderbolt(w, h, m, new Mage("딸기"), new Mage("토끼")); //전역공격
    }
}
