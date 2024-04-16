package day06.member;

import java.awt.*;

public class Test {
    public static void main(String[] args) {

        Member [] arr = new Member[5];

        Member m1 = new Member("sdg@naver.com", "1234", "메이", "여", 25); //default constructor
        Member m2 = new Member("rt@gmail.com", "3434", "바바", "알 수 없음", 21);
//        System.out.println("m1.memberName = " + m1.memberName);
//        System.out.println("m1.gender = " + m1.gender);
//        System.out.println("m1.regDate = " + m1.regDate);

//        arr [0] = 100;//동종모음구조로 같은 타입만 배열접근가눙 homogeneous collection
        arr[0] = m1;
        arr[1] = m2;
//        arr[2] = new Member("ad","d", "dsfs");

        Member[] members = {m1, m2}; //n dimensional array (?)

        System.out.println("m2 = " + m2.toString()); //자동으로 toString으로 호출된다.
        System.out.println("m1 = " + m1); //pointer, //reference : 참조 레퍼런스

    }
}
