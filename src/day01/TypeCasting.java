package day01;

import javax.xml.namespace.QName;

public class TypeCasting {
    public static void main(String[] args) {
        
        // = 도 대입연산이기 떄문에 연산처리됨.
        byte a = 100;   //1byte, 정수
        int b = a;      //4bite, 정수
        
        //암묵적 형 변환
        System.out.println("b = " + b);

        //2진수로 변환
        // 4bite 0(부호메모리, 음수일땐 1?) 00000000 00000011 11101000
        int c = 1000; //4byte
        //명시적 형 변환
        // d: 11010000
        // 0010111
        // 1의 보수 : +1
  
        //0000001
        //0011000 => 16 + 8 = 24

        byte d = (byte) c; //1byte
        System.out.println("d = " + d);
        
        int k = 50;
        double j = k;
        System.out.println("j = " + j);
        
        double m = 3.224;
        int n = (int)m;
        System.out.println("n = " + n);
        
        //암묵적 형 변환 -> upcasting (promotion)
        //명시적 형 변환 -> downcasting
        //=> 데이터 손실을 일으킬 수 있음
        
        int v = 100;
        double z = 5.5;
        //int -> double로 암묵적 형 변환 upcasting
        
        //타입이 다른 데이터의 연산은 작은 쪽을 큰쪽으로 캐스팅한다.
        double result = v + z;
        System.out.println("result = " + result);

        float f1 = 3.24F;
        double f2 = 5.5;
        double v1 = f1 - f2;

        int s = 10;
        double o = 5;
       int r2  =(int) (s * o);
        System.out.println("r2 = " + r2);
        
        byte b1 = 100;
        byte b2 = 50;
//       byte r3  = b1 + b2; 같은 타입으로 더해도 에러가 난다. 

        //int 이하의 사이즈 타입은 연산시 결과가 자동으로 int로 캐스팅 됨
//        char b1 = 'A'; //65
//        char b2 = 'C'; //67
//        char r3 = b1 + b2; 에러남
        int r3 = b1 + b2;
        System.out.println(b1 + b2);
        
        char cc = 'A'; 
        int plusNum = 3;
        char r4 = (char) (cc + plusNum); //D를 얻고 싶음
        System.out.println("r4 = " + r4);

        int x = 10, y = 20;

        System.out.println(x > 10 && (y / 0 == 10)); //false
        // 0으로 나누면 안되고(에러남) &연산자가 하나이면 단축평가를 실행하지 않는다.
        // &&는 단축평가를 실행한다. 그래서 에러가 나지 않는다.
        System.out.println(x > 10 || y < 30); //true
        
    }
}
