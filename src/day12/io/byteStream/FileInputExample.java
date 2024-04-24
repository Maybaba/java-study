package day12.io.byteStream;

import day12.io.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//바이트 기반 출력 스트림 예제 : 영상, 이미지, 텍스트 등 모든 데이터 출력 가능
//프로필 사진 업로드, 확인하기

//파일 안의 문자를 읽기
public class FileInputExample {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/Hello/pet.txt")) {

            //int data = fis.read();//세이브파일 로드 생성 명령
            //System.out.println("data = " + (char)data);
            int data = 0;
            while ((data = fis.read())!= -1) { //마지막 데이터이면 -1 반환
                //data = fis.read();
                //아스키 코드 문자 출력
                System.out.write(data);
            }
            //출력 버퍼 비우기
            System.out.flush();


        } catch (FileNotFoundException e) {
            System.out.println("해당경로를 찾을 수 없습니다. ");
        } catch (IOException e) {
            System.out.println("출력 시스템에 장애가 발생했습니다.");
        }
    }
}
