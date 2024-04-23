package day10.exception;

import java.util.InputMismatchException;

public class LoginUser {

    private String accout; //가입 시 아이디
    private String password; //가입 시 패스워드

    public LoginUser(String accout, String password) {
        this.accout = accout;
        this.password = password;
    }

    public enum LoginStatus {
        SUCCESS, ID_FAIL, PW_FAIL;
    }

    //로그인 검증
    public LoginStatus loginValidate(String inputAccount, String inputPassword) throws InputMismatchException, InvalidLoginInputException { //클래스에 적용
        // 아이디 일치하는지
        if(!inputAccount.equals(accout)) {
            throw new InvalidLoginInputException("아이디가 일치하지 않습니다"); // 새로운 에러를 일으키는 개념, 에러를 일으키는 것을 직접 커스터마이징하는 단계
//            System.out.println("아이디가 일치하지 않음");
//            return LoginStatus.ID_FAIL;
        }

        //비밀번호 일치하는지
        if(!inputPassword.equals(password)) {
            throw new InvalidLoginInputException("비밀번호 일치 않음");
//            System.out.println("비밀번호 일치 않음");
//            return LoginStatus.PW_FAIL;
        }
        System.out.println("로그인 성공");
        return LoginStatus.SUCCESS;
    }
}
