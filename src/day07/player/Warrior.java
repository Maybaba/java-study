package day07.player;

//하위클래스 sub class
//상위 클래스로부터 공통 필드와 메서드를 내려받은 클래스 // sub is a super
public class Warrior extends Player {
    int rage; //분노게이지

    public Warrior (String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.rage = 100;
    }
    //현재 캐릭터 정보를 출력
    public void dash(Warrior target ) {
        System.out.printf("DASH 스킬 사용합니다.");
    }
    // 오버라이딩: 부모가 물려준 메서드를 고쳐 쓰는 것
    // 규칙: 부모가 물려준 형태를 유지할 것(파라미터, 리턴타입, 이름)
    // 접근 제한자는 부모보다 more public 할 것

    @Override // 오버라이딩 룰을 지켰는지 검증한다. -> 다양성
    public void showStatus() {
        System.out.println("\n===============character's Info===============");
        super.showStatus(); //-> over-riding으로 부모함수를 가져온다  //showStatus(); //재귀 호출이라 무한루프 돌아서 터진다
        System.out.println("#rage : " +this.rage);
    }
}
