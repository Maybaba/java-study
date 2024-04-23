package day11.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        //배열이 필요할 땐... 배열대신
        //Book[] bookList2 = new Book[0];
        //BookList bookList = new BookList();
        ArrayList<String> books = new ArrayList<>();
        books.add("gk");
        books.add("후");
        books.add("후");
        books.add("후");
        System.out.println(books);

        //중간삽입 add(index, E)
        books.add(1, "계란덮밥 101가지");
        System.out.println(books);

        int size = books.size();
        System.out.println("size = " + size);
        
        int index = books.indexOf("후");
        System.out.println("index = " + index);

        boolean contains = books.contains("pasta : italian Meal");
        System.out.println("contains = " + contains);

        books.remove(0);
        System.out.println("books = " + books);

        books.remove("후");
        System.out.println("books = " + books);

        books.set(0, "여름, 비에이로부터의 초대");
        System.out.println("books = " + books);

        String s = books.get(1);
        System.out.println("s = " + s);

        //iteration
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i) + "- 신규도서 *");
        }
        System.out.println("===========================");

        for (String book : books) {
            System.out.println(book + " : 2024년 4월 22일 *");
        }
        
        books.clear();
        System.out.println("books = " + books); //[]

        System.out.println(books.isEmpty()); //true
        
        //리스트에 초기값(배열)넣고 시작하기
        //int[] arr = {10, 20, 30};
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 3, 2, -99));
        System.out.println("numbers = " + numbers);

        //오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println("numbers = " + numbers);

        //내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("numbers = " + numbers);
    }
}
