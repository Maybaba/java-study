package day12.lambda;

@FunctionalInterface
public interface ApplePredicate { //interface

    //사과를 전달받아 특정 조건에 의해 사과를 필터
    boolean test(Apple apple); //지금 추상적이니까 나중에 오버라이딩 해서 마음대로 써.
    //{
//        System.out.println("hello");
//        return true;
    }

