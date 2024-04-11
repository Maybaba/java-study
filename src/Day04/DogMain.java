package Day04;

public class DogMain {
    //class 바로 밑에서 만듦 : 지역변수 아님
    public static void main(String[] args) {
        Dog choco = new Dog("토코"); //main안에서 만듦 : 지역변수임
        Dog poppy = new Dog("뽀삐");

        System.out.println("choco = " + choco);
        System.out.println("poppy = " + poppy);

        choco.petInfo();
        System.out.println("=================");
        poppy.inject();
        poppy.petInfo();
    }
}
