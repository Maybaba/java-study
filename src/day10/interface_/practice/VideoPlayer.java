package day10.interface_.practice;

public class VideoPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("비디오 플레이");
    }

    @Override
    public void pause() {
        System.out.println("비디오 일시정지");
    }

    @Override
    public void stop() {
        System.out.println("비디오 멈춤");
    }
}
