package day12.io.textStream;

//텍스트 기반 스트림: 텍스트 입출력에 특화된 스트림으로
// 2바이트 이상 데이터 처리 가능

// 바이트 기반 스트림 : OutputStream, InputStream
// 텍스트 기반 스트림 : Writer, Reader

import day06.member.Member;
import day11.song.Artist;
import day12.io.FileExample;
import util.SimpleInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//텍스트를 세이브파일로 만들고 싶을 때
public class FileReaderExample {
    public static <List> void main(String[] args) {

        String targetParh = FileExample.ROOT_PATH + "/hello/member.txt";

        try (FileReader fr = new FileReader(targetParh)) {
            
            int read = fr.read();
            System.out.println("(char)read = " + (char)read);
            
            //read = fr.read();
            //System.out.println("(char)read = " + (char)read);
            
            System.out.println("read = " + read);

            //보조 스트림 활용
            //텍스트를 라인 단위로 읽어들이는 보조스트림
            BufferedReader br = new BufferedReader(fr);


            //회원정보 저장할 리스트 생성
            ArrayList<Member> memberList = new ArrayList<>();

            String s = br.readLine();
           //  System.out.println("s = " + s);

            String[] split = s.split(",");
            //System.out.println(Arrays.toString(split));
            //읽어들이 회원정보로 회원 객체 생성
            Member member = new Member(
                    split[0],
                    split[2],
                    split[1],
                    split[3],
                    Integer.parseInt(split[4])
            );
            //System.out.println("member = " + member);
            memberList.add(member);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
