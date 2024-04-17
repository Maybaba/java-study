package day07.player;

public class Hunter extends Player{
    int concentration;

    public Hunter(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.concentration = 100;
    }
    //헌터 전용 스킬
    public  void multipleArrow() {
    }
    public void showStatus() {
        System.out.println("\n===============character's Info===============");
        super.showStatus(); //-> over-riding으로 부모함수를 가져온다  //showStatus(); //재귀 호출이라 무한루프 돌아서 터진다
        System.out.println("#conc : " +this.concentration);
    }
}
