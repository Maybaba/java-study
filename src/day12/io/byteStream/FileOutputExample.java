package day12.io.byteStream;

import day12.io.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//바이트 기반 출력 스트림 예제 : 영상, 이미지, 텍스트 등 모든 데이터 출력 가능
//프로필 사진 업로드, 확인하기
public class FileOutputExample {

    public static void main(String[] args) {

        String message = "멍멍이는 멍멍 \n cats are like mewmewmewemwemew ~ ";

        //어느 폴더에 어떤 이름과 파일로 저장할 건지

        //메모리 자원 반납처리를 자동화해주는 문법
       // FileOutputStream fos = null; //바깥쪽에 null로 선언해서 전역적으로 활용
        //try with resource : close가 필요한 하드웨어 접근 코드에 대해 finally - close 사용하지 않아도 됨. auto close 처리 됨
        try (FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/Hello/pet.txt")) {
            // fos = new FileOutputStream(FileExample.ROOT_PATH + "/Hello22/pet.txt");
            fos.write(message.getBytes()); //세이브파일 생성 명령 -> 문자열을 바이트로 ㅕㄴ환
        } catch (FileNotFoundException e) {
            System.out.println("해당경로를 찾을 수 없습니다. ");
        } catch (IOException e) {
            System.out.println("출력 시스템에 장애가 발생했습니다. ");
        } /* finally { //예외가 나도, 나지 않아도 실행되는 코드
            System.out.println("이 코드는 무조건 실행!");
            //파일 입출력곽 같은 코드는 하드웨어에 직접 접근하는 코드이므로
            //보통 사용 후 메모리 정리를 해줘야 다음 실행에 문제가 생길 여지가 줄어듦
            //Scanner와 같은 경우도 마찬가지임
            try {
               if(fos != null) fos.close(); //null인지 아닌지 체크
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } */
    }
}
