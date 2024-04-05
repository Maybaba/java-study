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
    }
}
