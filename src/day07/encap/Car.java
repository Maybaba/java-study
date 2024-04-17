package day07.encap;

public class Car {

    //field
    private String model; //자동차 모델명 -> 데이터 변경을 막는다 : 정보은닉
    private int speed; //현재 속도 -> 특정 함수를 통해서 제한 : setter method
    private char mode; //변속 모드
    private boolean start; //시동이 걸린 여부

    //constructor
    Car(String medel) {
        this.model = medel;
//        this.speed = 0; 이미 기본값 존재
        this.mode = 'P'; //왜 쌍따옴표는 적용이 안돼냐
//        this.start = false; 이미 기본값 존재
    }

    //엔진에 연료가 주입되는 기능
    private void injectGasoline() {
        if (start) {
            System.out.println("엔진에 연료가 주입됩니다.");
        } else {
            System.out.println("시동이 켜지지 않았음");
            System.out.println("곧 자동차 폭 발 ");
        }
    }
    //엔진오일이 순환하는 기능
    private void moveEngineOil() {
        System.out.println("엔진오일이 순환합니다.");
    }
    //엔진 내부 실린더가 작동하는 기능
    private void moveCylinder () {
        System.out.println("내부 실린더가 왕복으로 움직입니다.");
    }

    //시동 버튼을 누르는 기능

    void startStop() {
        this.start = !this.start;
        if (start) {
            System.out.println("시동이 켜졌습니다. 운행준비를 시작합니다.");
            injectGasoline();
            moveEngineOil();
            moveCylinder();
        } else {
            System.out.println("시동이 꺼졌습니다. ");
        }
    }

    //현재 속도를 제한하는 메서드 : setter method : 필드값ㅇ르 안전하게 설정하기 위한 검증로직이 포함된 메서드
    //공개된 함수를 통해 제한
    public void setSpeed(int speed) {
        if (speed < 0 || speed > 200) {
            this.speed = 0;
            this.start = false;
            this.mode = 'P';
            System.out.println("제한 속도 위반으로 안전하게 꺼졌음");
        } else {
            this.speed = speed;
        }
    }

    //현재 속도값을 가져오는 메서드
    //getter method : 정보은닉된 필드를 가져오는 대리 메서드
    public int getSpeed() {
        return this.speed;
    }
    //boolean field's getter 는 이름관례가 다름 is + 필드명
    public boolean isStart() {
        return this.start;
    }


    //변속모드를 N, P, D 만 가능하게 제한하는 setter method
    public void setMode(char mode) {
        if(!(mode == 'P' || mode == 'D' || mode == 'N')) {
            System.out.println("잘못된 접근입니다.");
        } else {
            this.mode = mode;
        }
        /* 이렇게 할 수도 있음!
        *    switch (mode) {
            case 'P': case 'N': case 'D': case 'R':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';
        * */
    }

    //변속모드를 알 수 있는 getter method
    public char getMode() {
        return mode;
    }
}
