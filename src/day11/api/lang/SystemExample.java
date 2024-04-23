package day11.api.lang;

public class SystemExample {
    public static void main(String[] args) {

        //program run time check
        long start = System.currentTimeMillis();//static, private
        System.out.println("start = " + start);

        String s = "";
        for (int i = 0; i < 500000; i++) {
            s += "abc";
        }
        long end = System.currentTimeMillis();
        long time = end - start; // time during running program
        System.out.println("time = " + time / 1000.0 + "sec");
    }
}
