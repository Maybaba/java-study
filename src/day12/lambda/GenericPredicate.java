package day12.lambda;

public interface GenericPredicate<T> {
    //아무 요소를 받을 수 있는 메서드
    boolean test (T t);
}
