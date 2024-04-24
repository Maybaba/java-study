package day06.member;

import java.time.LocalDate;

//role & responsibility : 회원 1명의 정보를 가지고 있어야 한다.
public class Member {
    int id; // 식별번호
    String email;
    String memberName;
    String password;
    String gender;
    int age;
    LocalDate regDate; //회원가입일자 예를들어 조회수, 등록일자 등
    //자동으로 들어가는 데이터와 사용자가 직접입력하는 데이터를 구분한다.

    //생성자 : 회원정보가 생성될 때 초기 데이터를 처리
    // - 객체가 생성될 시점에 호출되는 함수로 객체의 초기화를 담당한다.
    // 시스템이 생성하는 데이터 : 회원번호, 회원가입일자
    // 사용자가 제공하는 데이터 : 이메일, 패스워드, 이름, 성별, 나이
    public Member(String email, String password, String memberName, String gender, int age) { //생성자 기본타입 : void
        this.id = 1;
        this.regDate = LocalDate.now(); //현재 시간을 읽어서 처리

        this.email = email; //자신의 이메일에 제공받은 이메일을 저장
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
    }

    //toString : 객체의 정보를 출력할 수 있음
    public String toString() {
//        return "name : " + this.memberName + "email :" + this.email;
        //string return format
        return String.format("#이름 : %s, email: %s, age : %d, gender: %s, reg : %s",
                this.memberName, this.email, this.age, this.gender, this.regDate);
    }
//    public String toString() {
//        return super.toString(); //16진수 Hex값으로 자동으로 호촐된다.
//    }
// 회원의 비밀번호를 수정하는 메서드
void changePassword(String newPassword) {
    this.password = newPassword;
}


}
