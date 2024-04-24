package day12.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    //배열에서 새로운 멤버를 추출해서 나이만 뽑거나 주소만 뽑거나...
    // 매핑 - 사과 리스트를 받아서 해당하는 색깔만 나감
    // 필터 - 사과리스트 그대로 나감
    //사과의 색상만 추출
    public static List<Color> mappingApplesByColor(List<Apple> basket) {
        List<Color> colors = new ArrayList<>();
        for (Apple apple : basket) {
            colors.add(apple.getColor());
        }
        return colors;
    }

    //사과의 무게만 추출
    public static List<Integer> mappingApplesByWeight(List<Apple> basket) {
        List<Integer> weightList = new ArrayList<>();
        for (Apple apple : basket) {
            weightList.add(apple.getWeight());
        }
        return weightList;
    }

    //X 객체 리스트에서 Y객체 리스트를 반환
    public static <X, Y> List<Y> map(List<X> xList, GenericFunction<X,Y> f) {
        //X 를 주면 그 안의 Y를 추출해줄게 ~ 사과리스트를 주면 무게를 추출해줄게 ~
        List<Y> mappedList = new ArrayList<>();
        for (X x : xList) {
            Y y = f.apply(x);
            mappedList.add(y);
        }
        return mappedList;
    }
}
