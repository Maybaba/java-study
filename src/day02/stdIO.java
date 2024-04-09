package day02;

import java.io.IOException;
import java.util.Scanner; //키보드를 입력바딕 위해 외부 라이브러리 가져옴

//standard input output
public class stdIO {
    public static void main(String[] args) throws IOException {

        String name = "김철수";

//        %s : string formatting %d : 정수 %f : 실수 %c : 단일문자
        System.out.printf("%s의 강아지", name); //출력에 변수를 넣고 싶을때
        System.out.printf("%s의 고양이", name); //printf, print는 줄바꿈이 없음
        //println 은 줄바꿈이 자동으로 도니다.

        //**자바에서 키보드 입력 받기
//        int read = System.in.read();
//        System.out.println("read = " + read);
        Scanner scan = new Scanner(System.in); //입력준비 1번만 하면 됨

        //*문자 입력받기
        System.out.print("이름 :");
        String username = scan.nextLine();
        System.out.println("username = " + username);

        //정수 입력받기 - 문자를 입력받은 뒤 정수로 변환
        System.out.print("출생년도 : ");
        int birthYear = Integer.parseInt(scan.nextLine());
        System.out.println("birthYear = " + birthYear);

    }
}
