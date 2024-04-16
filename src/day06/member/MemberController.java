package day06.member;

import util.SimpleInput;

// role : divide to while-true statement when user's menu input
public class MemberController {
    MemberView mv;
    SimpleInput si;

    MemberController() {
        this.mv = new MemberView();
        this.si = new SimpleInput();
    }

    //메뉴 입력 분기에 따라 할 일을 나눠주는 기능
    void run() {

        while (true) {
           String menuNum = mv.showProgramMenu();

           switch (menuNum) {
               case "1":
                   mv.inputNewMember();
                   break;
               case "2" : //이메일을 입력받는 코드
                   //테스트 주소 개발 기법
                   mv.searchMemberbyEmail();
                   break;
               case "3":
                   mv.showMembers();
                   break;
               case "4": //비밀번호를 수정하는 코드
                   mv.changeInfo();
                   break;
               case "5": //회원 객체를 삭제하는 코드
                   mv.deleteMember();
                   break;
               case "6": //회원 객체를 복구하는 코드
                   mv.recoverMember();
                   break;
               case "7":
                   boolean flag = mv.exitProgram();
                   if(flag) return;
           } //end switch

            si.stopInput();
        }//end while
    }
}
