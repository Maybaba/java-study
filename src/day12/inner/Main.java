package day12.inner;

public class Main {

    //내부 클래스 (중첩 클래스)
    //뺄셈 계산기가 필요한데 이 계산기 설계도는
    //Main class 안에서만 사용하고 외부에선 안쓸 것 같아
    //내부 클래스는 private 처리가 가능하다.
    public static class SubCalculator implements Calculator {
        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] args) {

        Calculator cal = new AddCalculator();
        int r1 = cal.operate(10, 20);
        System.out.println("r1 = " + r1);

        cal = new SubCalculator();
        int r2 = cal.operate(50, 22);
        System.out.println("r2 = " + r2);

        //익명 클래스 어나니모우스 클뢰스
        //이름이 없는 클래스를 빠르게 선언하는 법

        //그런데 여러번 안 쓰고 한번만 쓸 것 같아용
        cal = new Calculator() { //객체생성과 클래스 생성을 동시에!
            private int a;
            private int b;

            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };
        int r3 = cal.operate(10, 4);
        System.out.println("r3 = " + r3);

        //람다 문법
        //전제조건 : 반드시 인터페이스 안의 추상메서드가 1개여야 한다.
        cal = (n1, n2) -> n1 / n2;

        cal = new SubCalculator();
        int r4 = cal.operate(20, 3);
        System.out.println("r4 = " + r4);

//        new AddCalculator();
//        new AddCalculator();
//        new AddCalculator();
//        new AddCalculator();
//
//        new SubCalculator();
//        new SubCalculator();
//        new SubCalculator();
//        new SubCalculator();

        System.out.println("===================");
        Restaurant fr = new FrenchRestaurant();
        Restaurant fr2 = new FrenchRestaurant();
        Restaurant fr3 = new FrenchRestaurant();

        //절대로 한번만 만들고 사용할 때 : 익명클래스
        Restaurant japaneseR = new Restaurant() {
            @Override
            public void cook() {
                System.out.println("하나만 있는 일식요리식당을 개업했습니다. ");
            }
        };

            //변수의 타입 : 레스토랑, //오버라이딩 하는 객체가 메서드 1개
        //overriding 이 여러개 있으면 람다(이름을 지우는)문법을 적용해도 알아보기 어렵다.
        Restaurant italian = ()-> System.out.println("파스타를 만듭니다");

        fr.cook();
        japaneseR.cook();
    }
}
