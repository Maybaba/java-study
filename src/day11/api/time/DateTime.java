package day11.api.time;

import day08.static_.Calculator;
import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DateTime {
    public static void main(String[] args) {
       
        //before only java 8
        // Date date = new Date(); // @deprecated
        // System.out.println("date.getYear() = " + date.getYear());
       // new Calendar(); //abstract object
        Calendar calendar = Calendar.getInstance();
        System.out.println(Calendar.MAY);
        
        //after java 8
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);

        LocalDate targetDate = LocalDate.of(2022, 4, 15);
        System.out.println("targetDate = " + targetDate);

        //특정 날짜로부터 몇일 뒤가 반납일일 경우
        LocalDate rentalDate = LocalDate.now();
        LocalDate returnDate = rentalDate.plusDays(50);
        System.out.println("returnDate = " + returnDate);

        LocalDate TargetDatetime = returnDate.plusDays(32).plusMonths(2).plusWeeks(3);
        System.out.println("TargetDatetime = " + TargetDatetime);

        //사이날짜 구하기
        LocalDate hireDate = LocalDate.of(2023, 5, 15);
        LocalDate retireDate = LocalDate.of(2023, 12, 31);

        long between = ChronoUnit.DAYS.between(hireDate, retireDate);
        System.out.println("between = " + between);

        //날짜 포맷 바꾸기
        System.out.println("nowDateTime = " + nowDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy year mm dd a hh mm ss");
        String format = nowDateTime.format(dateTimeFormatter);
        System.out.println("format = " + format);

    }
}
