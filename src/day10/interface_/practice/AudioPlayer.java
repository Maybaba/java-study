package day10.interface_.practice;

public class AudioPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("오디오 플레이");
    }

    @Override
    public void pause() {
        System.out.println("오디어 일시정지");
    }

    @Override
    public void stop() {
        System.out.println("오디오 멈춤");
    }
}
