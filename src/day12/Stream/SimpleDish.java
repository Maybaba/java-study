package day12.Stream;

public class SimpleDish {
    //field
    private final String name;
    private final int cal;

    //constructor
    public SimpleDish(String name, int cal) {
        this.name = name;
        this.cal = cal;
    }


    //객체 전체를 받겠다!!!!!!
    public SimpleDish(Dish dish) {
        this.name = dish.getName();
        this.cal = dish.getCal();
    }

    public String getName() {
        return name;
    }

    public int getCal() {
        return cal;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name=" + name +
                ", cal=" + cal +
                '}';
    }
}
