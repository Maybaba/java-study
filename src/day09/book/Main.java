package day09.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LibraryRepository repo = new LibraryRepository();
        Book[] array = repo.searchBookList("원");
        for (Book book : array) {
            System.out.println(book.info());
        }

    }
}
