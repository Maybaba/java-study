package day07.player;

public class Mage extends Player {
    //어떤 필드를 지우려면?? 상위클래스 속성을 활용한다.
    int mana;

    public Mage(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.mana = 100;
    }
    //마법사 스킬
    public void thunderbolt(Mage... targets) {
    }
    public void showStatus() {
        System.out.println("\n===============character's Info===============");
        super.showStatus(); //-> over-riding으로 부모함수를 가져온다  //showStatus(); //재귀 호출이라 무한루프 돌아서 터진다
        System.out.println("#mana : " +this.mana);
    }

}
