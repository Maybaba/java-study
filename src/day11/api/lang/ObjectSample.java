package day11.api.lang;

import java.util.Objects;

//lang : you can use without import even at different package!
class Pen {
    long serial;
    String color;
    int price;
    Company company;

    public Pen(long serial, String color, int price, Company company) {
        this.serial = serial;
        this.color = color;
        this.price = price;
        this.company = company;
    }

    //펜의 시리얼 번호가 같으면 같은 펜으로 취급한다. -> 마찬가지로 object 의 class라서 커스텀 가능
    //equals를 오버라이딩 할 때는 반드시 hashcode도 같이 오버라이딩 하여
    //두 객체가 같을 경우 주소값도 같게 만든다.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return serial == pen.serial;  //&& price == pen.price && Objects.equals(color, pen.color) && Objects.equals(company, pen.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial); //color, price, company);
    }

    /*
        @Override
        public boolean equals(Object o) {
            if (o instanceof Pen) {
                Pen target = (Pen) o; //o 를 pen 으로 다운캐스팅
                return this.serial == target.serial;
            }
            return false;
        }
         */
    //toString을 커스터마이징 할 수 있다.
    @Override
    public String toString() {
        return "Pen{" +
                "serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", company=" + company +
                '}';
    }
}
class Company {
    String companyName;
    String address;

    public Company(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
    }

  //  @Override //toString() overriding , contol + enter
   //   public String toString() {
//        return "하하하하하";
//    }
}

public class ObjectSample extends Object{
    public static void main(String[] args) {
        Company company = new Company("모나미", "서울");
        System.out.println("company = " + company); // final 이 붙지 않아, overriding 가능

        Pen yellowPen = new Pen(100L, "노랑", 1000, new Company("제트스트림", "동부"));

        //didn't input company -> null
        System.out.println("yellowPen.company = " + yellowPen.company);

        if(yellowPen.company != null) {String cName = yellowPen.company.companyName;
            System.out.println("cName = " + cName);
            System.out.println("yellowPen = " + yellowPen);
        }

        Pen bluePen
        = new Pen(200L,
                "파랑",
                1200,
                new Company("제트스트림", "동부"));

        System.out.println("===================");

        //16진수 변환하기
        System.out.println(yellowPen == bluePen);
        System.out.println(Integer.toHexString((bluePen.hashCode())));
        System.out.println(yellowPen.hashCode());

        System.out.println("==================================");

        //만약에 펜의 시리얼넘버가 같다면 같은 펜으로 취급하겠다
        System.out.println(yellowPen.equals(bluePen)); //주소값을 참조하기 때문에 false
        Pen redPen1 = new Pen(150L, "red", 1000, company);
        Pen redPen2 = new Pen(150L, "red", 1500, company);

        System.out.println(redPen1 == redPen2);
        System.out.println(redPen1.equals(redPen2));

        System.out.println("redPen1 = " + redPen1.hashCode());
        System.out.println("redPen2 = " + redPen2.hashCode());
        //소멸자는 지원되지 않음
    }
}
