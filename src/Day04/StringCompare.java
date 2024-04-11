package Day04;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scscsc = new Scanner(System.in);
        
        
        String inputName = scscsc.nextLine(); //string 리턴
        String myName = new String("홍길동");
        //String 이 사실은 class 이었다..!
        
        char[] nickName = {'축','구', '감', '상'};
        String nick = new String(nickName);
        System.out.println("nick = " + nick);

        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);

        if(myName == inputName) {
            System.out.println(" 두 문자열이 같다");
        } else {
            System.out.println("두 문자열이 다르다");
        }

        //기본데이터타입
        int a = 10;
        int b = 10;
        System.out.println(a == b);

        //참조, 객체타입 -> 주소 참조
        Dog e = new Dog();
        Dog f = new Dog();
        System.out.println(e == f);

        
        
    }
}
