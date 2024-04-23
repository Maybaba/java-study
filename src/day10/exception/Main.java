package day10.exception;

public class Main {
    public static void main(String[] args) {
        ThrowsExample te = new ThrowsExample();

//        int i = te.inputNumber();
//        System.out.println("i = " + i);

//        int n = te.convert("100");
//        System.out.println("n + 20 = " + n + 20);

        LoginUser user = new LoginUser("ab12", "1234");
        try {
            user.loginValidate("ab", "1234");
        } catch (InvalidLoginInputException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); //에러 로그 출력
//            throw new RuntimeException(e.getMessage());
        }
    }
}
