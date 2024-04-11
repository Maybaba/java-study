package Day04;

public class FieldAndLocak {
    //값을 넣지 않아도 에러가 뜨지 않는 이유 :
    //필드는 값을 초기화하지 않아도 각타입의 기본값으로 자동 세팅
    // 정수 : 0 실수 0.0 논리 false 문자(char) '' 나머지 null
    int aaa; //heap area

    //ccc : 매개변수 parameter - method 호출 시 반드시 필요한 인자값
    void foo(int ccc) {
        int bbb = 0; //stack area
        //값을 초기화(입력)하지 않으면 자동으로 값을 부여해주지 않는다.
        //그래서 에러난다.

        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("ccc = " + ccc);
    }
}
