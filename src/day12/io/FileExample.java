package day12.io;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static final String ROOT_PATH = "/Users/sin-yunjong/Desktop";

    public static void main(String[] args) {

        //폴더 생성 명령
        //파일 정보 객체 생성
        File directory = new File(ROOT_PATH + "/Hello");

        //폴더 생성
        if(!directory.exists()) directory.mkdir();

        //파일 생성
        File newFile = new File(ROOT_PATH + "/Hello/food.txt");
        //throws -> try&catch 혹은 예외class import -> IOException
            if(!newFile.exists()) //왜 if 문도
                try { newFile.createNewFile();
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
        }
        System.out.println("파일을 생성하였습니다. ");
    }
}
