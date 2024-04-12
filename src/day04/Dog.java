package day04;

//설계도 !
public class Dog {

    // 필드 : 객체의 속성
    String dogName;
    int age;
    boolean injection;

    // method : 객체의 기능-
    void petInfo() {
        System.out.printf("우리집 강아지는 %s 에요~ %d 살이에요 \n", dogName, age);
        if (injection) {
            System.out.println("예방접종을 했어요!");
        } else {
            System.out.println("예방접종을 안했어요!");
        }
    }
    void inject() {
        System.out.printf("%s 강아지에게 주사를 맞혀요 \n", dogName);
        injection = true; //기존의 field를 사용하게 되면 함수내에서 사용하더라도 field임!
        //함수안에서 만들면 지역변수임!
    }
    //생성자
    Dog() {
        System.out.println("1번 생성자 호출");
    }
    Dog(String dName) {
        System.out.println("2번 생성자 호출");
        dogName = dName;
        age  = 1;
    }
}


