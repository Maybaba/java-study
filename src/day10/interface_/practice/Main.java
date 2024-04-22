package day10.interface_.practice;

public class
Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.addMedia(new VideoPlayer());
        player.addMedia(new AudioPlayer());
        player.addMedia(new ImageDisplay());

        player.playAll();  // 모든 미디어 파일 재생 (각각의 play메서드 호출)
        //반복문을 통해 mediaList에 있는 모든 미디어 재생
    }
}
