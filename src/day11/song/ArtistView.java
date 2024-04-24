package day11.song;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import util.SimpleInput;

//프로그램의 입출력 처리 담당
public class ArtistView {

    //필드
    private static ArtistRepository artistRepository = new ArtistRepository();

    //탐색프로그램 실행
    public static void start() {
        /*
        //세이브 파일 로드
        artistRepository.load();

        while (true) {
            System.out.println("\n *********** Spotifive **************");
            System.out.printf("# 현재 등록된 가수 : %d명\n", ArtistRepository.count());
            System.out.println("1. 노래 등록하기");
            System.out.println("2. 노래 검색하기");
            System.out.println("3. 프로그램 종료");

            String menuNum = SimpleInput.input("- 메뉴 입력 : ");

            switch (menuNum) {
                case "1":
                    makeNewArtistSong();
                    break;
                case "2":
                    serchSongByName();
                    break;
                case "3":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("메뉴를 잘못 입력하셨습니다. ");
            }
        }

         */
    }

    /*
    //노래 검색 기능
    public static void serchSongByName() {
        String keyword = SimpleInput.input("# 가수 이름 검색 : ");
        //가수이름이 이미 있으면
        Set<String> songList = null;
        if (artistRepository.isRegistered(keyword)) {
            //노래목록 가져오는 getSongList 함수 만들기
            songList = artistRepository.getSongList(keyword);

            //노래가 이미 1곡 있으니까 int 1 설정
            int num = 1;
            System.out.printf("\n# %s님의 노래목록 \n", keyword);
            for (String song : songList) {
                System.out.println("==============================");
                System.out.printf("# %d. %s\n", num++, song);
            }

        } else { // 없는 가수이면
            System.out.println("\n# 해당 가수는 등록되지 않았습니다.");
        }

         public static void makeNewArtistSong() {
            //새로운 가수, 노래제목 입력받기
            String artistName = SimpleInput.input("# 노래 등록을 시작합니다 \n - 가수명 : ");
            String songName = SimpleInput.input(" - 노래제목 : ");

            //결과화면 출력 -> 디테일을 안만듦
            if (!(isResistered(artistName))) { //신규등록인지 아닌지
                //신규등록 후 map 데이터 저장 (put)
                artistRepository.saveArtistSong(artistName, songName);
                // 추가 잘됐는지 여부 확인 -> 예외처리 ~ throw 할 수 이씀
                System.out.printf("# %s님의 곡이 신규 등록되었습니다", artistName);
                //기존 가수 노래목록에 노래만 추가해?
                boolean flag = artistRepository.saveSong(artistName, songName);


                //add new song -> 노래등록 시작~ boolean 처리하기 boolean 처리에 따라서 if else 문을 넣는다.

            } else { //신규등록이 아니라 기존 등록가수에 곡명만 추가?
                if (true) {
                    System.out.printf("# %s님의 새로운 곡 %s이 신규 등록되었습니다", artistName, songName);
                } else { //노래가 중복된 경우
                    System.out.println("\n [%s] 곡은 이미 등록된 노래입니다람쥐. ");
                }
            }
            //등록된 내용 세이브파일에 저장하기
            artistRepository.load();
        }
    }
     */
}
