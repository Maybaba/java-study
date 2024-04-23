package day10.exception;

//원하는 에러메세지와 에러 종류 커스텀 해서 진행
//관례 : 에러이름 후에는 꼭 부모클래스 Exception 이 붙어야 함
public class InvalidLoginInputException extends Exception {

    public InvalidLoginInputException() {
    }

    public InvalidLoginInputException(String message) {
        super(message);
    }
}
