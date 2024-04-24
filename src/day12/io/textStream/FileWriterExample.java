package day12.io.textStream;

//텍스트 기반 스트림: 텍스트 입출력에 특화된 스트림으로
// 2바이트 이상 데이터 처리 가능

// 바이트 기반 스트림 : OutputStream, InputStream
// 텍스트 기반 스트림 : Writer, Reader

import day12.io.FileExample;
import util.SimpleInput;

import java.io.File;
import java.io.FileWriter;

//텍스트를 세이브파일로 만들고 싶을 때
public class FileWriterExample {
    public static void main(String[] args) {

        String targetParh = FileExample.ROOT_PATH + "/hello/hobby.txt";

        try (FileWriter fw = new FileWriter(targetParh)) {

            String hobby = SimpleInput.input("취미를 입력하세요 \n >>");
            String outputMessage = String.format("내 취미는 %s 입니다. \n", hobby);

            //파일 생성 명령
            //문자열을 입력받으면 바이트배열을 변환, command + p 로 처리할 수 있는 문자 확인
            fw.write(outputMessage);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
