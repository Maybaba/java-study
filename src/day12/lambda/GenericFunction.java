package day12.lambda;

@FunctionalInterface
public interface GenericFunction<X, Y> { //generic 이 두개라오!

    //X를 주면 Y를 추출해줄게
    Y apply(X x);
}
