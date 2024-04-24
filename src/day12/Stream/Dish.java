package day12.Stream;

public class Dish {

    private final String name; // 요리 이름
    private final boolean vegeterian; // 채식주의 여부, 한번 입력하면 끝임
    private final int cal; // 칼로리
    private final Type type; // 요리 카테고리
    public enum Type {
        MEAT, FISH, OTHER
    }

    public Dish(String name, boolean vegeterian, int calories, Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.cal = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public int getCal() {
        return cal;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calories=" + cal +
                ", type=" + type +
                '}';
    }
}
