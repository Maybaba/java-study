package day12.io.obj;

import java.io.Serializable;
import java.util.Objects;

//Serializable : 객체를 입출력하기 위해 직렬화해주는 인터페이스
public class Snack implements Serializable {

    public enum Taste {
        GOOD, BAD, SOSO
    }
    private String snackName; //과자이름
    private int year;
    private int price;
    private Taste taste;

    public Snack(String snackName, int year, int price, Taste taste) {
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }

    //private 에 접근하려 하기 위해서 아래를 생성함


    public String getSnackName() {
        return snackName;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    //overriding
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return year == snack.year && price == snack.price && Objects.equals(snackName, snack.snackName) && taste == snack.taste;
    }

    @Override
    public int hashCode() {
        return Objects.hash(snackName, year, price, taste);
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", taste=" + taste +
                '}';
    }
}
