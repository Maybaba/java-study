package day11.song;


import day12.io.FileExample;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//가수 객체 여러 개를 관리(조회, 수정, 삭제, 생성, 탐색, 정렬...)
public class ArtistRepository {

    //가수들을 담을 자료구조 선언
    //key: 가수이름, value : 가수 객체(가수명, 노래리스트)
    private static Map<String, Artist> artistMap = new HashMap<>();

    // 세이브파일 위치 경로
    public static final String SAVE_PATH = FileExample.ROOT_PATH + "/hello/song.sav";

    //총 몇명이 포함되어 있어?
    public int count() {
        return artistMap.size();
    }

    /*

    //가수 정보 생성 로직 - 입력받은 데이터 저장
    public void saveArtistSong(String artistName, String songName) {
        Artist newArtist = new Artist(String artistName); //이거 왜 입력이 안되냐
        newArtist.addSong(songName);
        //첫번째 맵에 artist 이름, 노래 추가하기
        artistMap.put(artistName, new Artist());

        System.out.println("곡 저장 로그 :" + artistMap);
    }

    //가수 정보 탐색 로직
    public Set<String> getSongList(String keyword) {
        return this.songList;
    }

     */

    /**
     * @param artistNAme - 등록할 가수 이름
     * @return - 가수 이름이 있으면 true 없으면 false 리턴
     */
    //이미 있는 가수이면 노래목록만 추가해야지! 확인함수
    /*
    public boolean isRegistered(String artistNAme) {
        return artistMap.containsKey(artistNAme);
    }

    //입력한 데이터 파일에 저장하기
    public void load() {
        File file = new File(SAVE_PATH);
        if(file.exists()) {
            try(FileInputStream fis = new FileInputStream(SAVE_PATH)) {

                ObjectInputStream ois = new ObjectInputStream(fis);
                this.artistMap = (Map<String, Artist>)ois.readObject(); //type casting
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //입력된 파일 출력 implenemts Serialize
        public void save() {
            try (FileOutputStream fos = new FileOutputStream(SAVE_PATH)) {

                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(artistMap);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

     */
}


