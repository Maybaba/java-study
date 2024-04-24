package day11.song;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

// 1개의 가수 정보
public class Artist implements Serializable {
    private String artistName; //가수명
    private Set<String> songList; //노래목록 : 노래저장순서가 중요하지 않을 때     //Set<ARTIST> songList 로 작사, 작곡, 가사 기타등등 추가해보기

    //Artist에 가수이름 추가하기
    public void Artist(String artistName) {
        this.artistName = artistName;
        // 빈 노래 배열 추가
        this.songList = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }

    /**
     *
     * @param songName - 입력받은 노래 이름
     * @return - 노래를 추가한 artist의 songList 리턴
     */
    public boolean addSong(String songName) {
        return this.songList.add(songName);
    }

    public Set<String> getsongList() {
        return this.songList;
    }
}
