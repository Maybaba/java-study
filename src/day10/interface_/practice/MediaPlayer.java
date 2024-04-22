package day10.interface_.practice;


import java.util.Arrays;

public class MediaPlayer {
    //미디어 목록 배열 추가
    private MediaPlayable[] mediaList = new MediaPlayable[0];
    void addMedia(MediaPlayable media) {
        MediaPlayable[] temp= new MediaPlayable[mediaList.length + 1];
        for (int i = 0; i < mediaList.length; i++) {
            temp[i] = mediaList[i];
        }
        temp[mediaList.length] = media; //새로운 temp 의 length는 같다
        this.mediaList = temp;
    }
    // 주어진 media를 mediaList배열에 추가
    /* MediaPlayable[] temp = Arrays.copyOf(mediaList, mediaList.length + 1); // 배열 복사
    temp[temp.length - 1] = media;
        this.mediaList = temp;
        */
    void playAll() {
        System.out.println("모든 미디어 파일 재생");
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.play();
        }
    }
}
