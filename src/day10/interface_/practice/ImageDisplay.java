package day10.interface_.practice;

public class ImageDisplay implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("이미지 플레이");
    }

    @Override
    public void pause() {
        System.out.println("이미지 일시정지");
    }

    @Override
    public void stop() {
        System.out.println("이미지 멈춤");
    }
}
