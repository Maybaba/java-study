package day09.book;

import util.SimpleInput;

public class BookUser {
    private String name; // 도서관 회원 이름
    private int age; // 도서관 회원 나이
    private Gender gender; // 성별
    private int couponCount; // 쿠폰 갯수
    private Book[] rentBookList; // 빌린 책 정보

    public BookUser(String name, int age, Gender gender, int couponCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;

//        System.out.println("입력한 data 정상적으로 입력완료");
        //정상적으로 instance 만들어짐, instance가 saveBookUser 로 가는지 확인완료
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }
    public String getGenderToString() {
        return getGender() == Gender.MALE ? "남성" : "여성";
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    //회원 정보 문자열 생성
    public String toString() {
        return "****** 신규 회원 가입을 축하드립니다. ******\n name : " + this.name + " age : " + this.age + " gender : " + gender;
    }
}

