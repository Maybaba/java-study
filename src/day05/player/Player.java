package day05.player;

public class Player {
    //필드 : 객체의 속성
    String nickName;
    int level;
    int hp;

    //생성자 : 객체가 만들어질 초기에 어떤 값을 가질 지 정하는 곳
    //기본 생성자 : default constructor
    public Player() {
        //생성자는 생성자 내부에서 또다른 생성자를 부를 수 있다. 생성자 내부의 맨 첫줄에 입력
        //this()로 다른 생성자를 부를 때 생성자당 1번씩만 가능
        //import와 같은 개념
        this("이름없는캐릭터", 1, 34); // this를 붙여서
        // 나의 또다른 생성자를 불러줘잉
        System.out.println("0번 생성자 호출!");
    }
    Player(String nickName) {
        this(nickName, 1, 50);
        System.out.println("1번 생성자 호출!");
//        this.nickName = nick; //this를 붙여서 나의 필드임을 알려줘잉
//        this.level = 1;
//        this.hp = 50;
    }
    public Player(String nickName, int level) {
        this(nickName, level, 50);
        System.out.println("2번 생성자 호출!");
//        this.nickName = nickName;
//        this.level = level;
//        this.hp = 999;
    }

    public Player(String nickName, int level, int hp) {
        System.out.println("3번 생성자 호출!");
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }
//    void info(Player this) {
//
//    }
    //메서드
    void attack(Player this, Player target) {
        System.out.println("this = " + this); //주어를 찾기 위한 키워드
        System.out.println("target = " + target);
        //맞은 player's hp will decrease 10
        target.hp -= 10;
        //때린 player의 체력을 3 감소시킴
        this.hp -= 3;

        System.out.printf("%s님이 %s님을 공격했습니다.\n", this.nickName, target.nickName);
        System.out.printf("%s님의 남은 체력 : %d\n", this.nickName, this.hp);
        System.out.printf("%s님의 남은 체력 : %d\n", this.nickName, target.hp);

    }
}
