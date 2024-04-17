package day06.member;

import util.SimpleInput;

// 역할: 회원 데이터 관리를 위해 입력 출력을 담당함
public class MemberView {

    // 객체의 협력
    MemberRepository mr;
    SimpleInput si;
    RestoreMembers rm;

    MemberView() {
        this.mr = new MemberRepository();
        this.si = new SimpleInput();
        this.rm = new RestoreMembers();
    }

    void showMembers() {
        System.out.printf("========= 현재 회원 목록 (총 %d명) ==========\n", mr.members.length);
        for (Member m : mr.members) {
            System.out.println(m);
        }
    }


    //회원정보 생성을 위해 입력을 처리 + 회원정보 입력 시 입력완료 메시지 출력
    void inputNewMember() {
        //util 에서 자주 쓰는 객체를 만들어 놓고 호출해와서 쓴다. (모듈화와 비슷한 개념인듯?)
        //Main에서 가져옴
        String email = null;
        while (true) {
            System.out.println("** 새로운 회원정보를 입력합니다 **");
            email = si.input("- 이메일: "); //while 밖에서 써야 해서 string 선언은 스코프 밖으로 뺀다.
            if(!mr.isDuplicateEmail(email)) {
                break;
            }
            System.out.println("중복된 이메일입니다.");
        }

        String name = si.input("- 이름: ");
        String password = si.input("- 패스워드: ");
        String gender = si.input("- 성별: ");
        int age = Integer.parseInt(si.input(" - 나이: "));

        //입력데이터를 기반으로 한 명의 회원 객체를 생성 Main에서 가져옴
        Member newMember = new Member(email, password, name, gender, age);

        //위임 - 관심사의 분리 (정보의 위임 후 관여하지 않는다 )
        mr.addNewMember(newMember);

        //입력완료
        System.out.println("**회원정보 저장 완료 **");
    }

    //사용자에게 보여줄 전체 메뉴 화면 출력
    String showProgramMenu() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        //회원이 있는지 boolean값으로 확인 후 false -> return, true 시에만 출력하기
        if (isEmptyMembersArray()) {
            System.out.println("* 5. 회원 삭제하기");
        }
        System.out.println("* 6. 삭제된 회원 복구하기");
        System.out.println("* 7. 프로그램 종료");
        System.out.println("========================");

        String menuNumber = si.input(("- 메뉴 번호: "));
        return menuNumber;
    }

    //현재 회원이 있는지 확인하기
    boolean isEmptyMembersArray() {
        if (mr.members.length > 0) {
            return true;
        }
        return false;
    }

    //프로그램 종료를 판단하는 입출력
    boolean exitProgram() {
       String exit = si.input("- 프로그램을 종료합니까 ? [y/n] \n>> ");
       if(exit.equals("y")) {
           System.out.println("*** 프로그램 종료 ***");
           return true;
       } else {
           System.out.println("프로그램 종료를 취소합니다");
           return false;
       }
    }

    //이메일을 입력받고 찾은 회원정보를 출력
    public void searchMemberbyEmail() {
       String inputEmail = si.input("#회원의 이메일을 입력 \n >>");

       //이메일 일치하는 회원이 있는지 조회
        Member foundMember = mr.findMemberByEmail(inputEmail);

        if (foundMember != null) {
            System.out.println("조회결과");
            System.out.println("이름 : " +foundMember.memberName);
            System.out.println("이메일 : " +foundMember.email);
            System.out.println("나이 : " +foundMember.age);
            System.out.println("성별 : " +foundMember.gender);
        } else {
            System.out.println("해당 회원은 존재하지 않습니다. ");
        }
    }

    //수정할 이메일을 입력받고 새로운 비밀번호 입력받기
    public void changeInfo() {
        String inputEmail = si.input("#수정할 회원의 이메일을 입력 \n >>");
        //이메일이 일치하는 회원이 있는지 조회
        Member foundMember = mr.findMemberByEmail(inputEmail);

        if(foundMember != null) {
            System.out.printf("%s님의 비밀번호를 변경합니다", foundMember.memberName);
            //새로운 비밀번호 입력받기
            String inputNewPassword = si.input("\n#새로운 비밀번호 입력 \n >>");
            //입력받은 비밀번호 덮어쓰기
        foundMember.password = inputNewPassword; //요기 말고 Member class에 만들어야 적절하다.
//            foundMember.changePassword(inputNewPassword);
            //수정된 회원정보 보여주기
            System.out.println("수정결과");
            System.out.println("이름 : " +foundMember.memberName);
            System.out.println("이메일 : " +foundMember.email);
            System.out.println("비밀번호 : " +foundMember.password);
            System.out.println("나이 : " +foundMember.age);
            System.out.println("성별 : " +foundMember.gender);
        } else {
            System.out.println("해당 회원은 존재하지 않습니다. ");
        }
        //회원의 비밀번호 실제 수정 -> 다시 실행해보기
//        void changePassword(String inputNewPassword) {
//            this.password = inputNewPassword;
//        }
    }
    //회원정보 삭제 및 복구 데이터
    public void deleteMember() {
        //회원의 이메일 입력
        String inputEmail = si.input("삭제할 멤버의 이메일 입력 \n >>");

        //이메일이 일치하는 회원이 있는지 조회
        Member foundMember = mr.findMemberByEmail(inputEmail);
        System.out.println("foundMember = " + foundMember);
        if(foundMember != null) {
            //2차로 비밀번호 검사
            String inputPw = si.input("비밀번호 입력 : ");
            if(inputPw.equals(foundMember.password)) {
                //입력한 비밀번호로 기존 배열 대조 후 삭제 후
                // restore배열에 복사
                mr.removeMember(inputEmail);
                // ** 삭제한 데이터를 restore 배열복사
                System.out.printf("%s 님의 회워정보가 삭제되었습니다. ", foundMember.memberName);
                System.out.println("복구를 원하시면 복구 메뉴를 이용");
            } else {
                System.out.println("\n비밀번호거 일치하지 않습니다. 삭제를 취소합니다. ");
            }
        } else {
            System.out.println("해당 회원은 존재하지 않습니다. \n");
        }
    }

    // 회원 복구에 관련한 입출력 관리  : 선생님 레포 참고
    /*   public void restoreMember() {

    }
    */

    //restore 배열을 가져와서 복구
    public void removeMember() {

    }





}