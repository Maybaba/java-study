package day01; //폴더이름 변경할 수 없음

public class Variable { //클래스 이름 변경할 수 없음

    static int n4 = 40;

    public static void main(String[] args) {


        int score = 78; //정수
        String userName = "홍길동"; //문자열

        //int userName; 중복허용하지 않음
        //run; 변수이름을 동사로 짓지 말자
        int userNAme;
        int phoneNumber; //camelCase를 따른다.

        //변수의 스코프 -> 블록레벨 스코프
        //자바의 변수는 생성된 블록이 종료되면 메모리에서 사라짐
        int i = 100;
        for (int j = 0; j <5 ; j++) {
            System.out.println(j);
        } //end for

        int n1 = 10;
        int n2;
        if (true) {
            System.out.println(n1);
            n2 = 20;

            while(true) {
                System.out.println(n2);
                int n3 = 30;
                break;
            }
            System.out.println(n2);
        }//end if
        System.out.println(n2);
//        System.out.println(j);
    }//end main
}//end class
