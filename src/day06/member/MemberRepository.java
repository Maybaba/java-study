package day06.member;

// role : 회원 배열을 관리하는 역할 - 회원 데이터 저장소
public class MemberRepository {
    //filed
    static  Member[] members; // members 배열 -> MemberList, StringList를 만들었던것처럼 만들기
    RestoreMembers rm;

    //constructor
    MemberRepository() { //members 배열 안의 new member 객체
        this.members = new Member[0]; //start from empty array

//        members[1] = new Member("ad5@naver.com", "12₩2", "바바", "여성", 45);
//        members[0] = new Member("adf@naver.com", "1234", "바비", "여성", 45);
//        members[2] = new Member("a2f@naver.com", "12ㅂㅂ", "므므", "여성", 45);
    }
    //method
    //print all members info --- Memberview 로 이동
//    void showMembers() {
//        System.out.printf("====================현재 회원 목록 총 %d명========\n", members.length);
//        for (Member m : members) {
//            System.out.println(m);
//        }
//    }

    /**
     * 생성된 회원정보를 회원 배열 끝에 추가하는 기능
     * @param newMember - 사용자의 입력으로 전달된 회원 정보 객체
     */
    Member addNewMember(Member newMember) { //정보를 객체로 만들어서 가져오기

        //배열에 데이터 추가하는 로직
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) { //첨언 ~
            temp[i] = members[i];
        }
        temp[temp.length -1] = newMember;
        members = temp;

        return newMember;
    }

    /**
     * 이메일 중복 확인 - 배열 탐색 알고리즘
     * @param targetEmail - 검사할 사용자의 입력 이메일 값
     * @return - 이메일이 이미 존재한다면 true, 존재하지 않는 사용 가능한
     * 이메일이면 false
     * @author - 메이
     * @since 2024.04.15
     * @git-issue-number 1234452345
     */
    boolean isDuplicateEmail(String targetEmail) {
        return findMemberByEmail(targetEmail) != null;
//        for (Member m : members) {
//            if (targetEmail.equals(m.email)) {
//                return true;
//            }
//        }
//        return false;
    }

    /**
     * 이메일을 통해 회원 객체를 가져오는 메서드
     * @param inputEmail - 사용자가 입력한 이메일 값
     * @return - 해당 이메일을 통해 찾아낸 회원 객체, 만약 찾지 못하면 null 리턴
     */
    public Member findMemberByEmail(String inputEmail) {
        for (Member m : members) {
            if(inputEmail.equals(m.email))
                return m;
        }
        return null;
    }

    //입력받은 이메일로 인덱스 찾기
    int findIndex(String email) {
        for (int i = 0; i < members.length; i++) {
            if(email.equals(members[i].email)) {
                return i;
            }
        }
        return -1; //못찾았음 falsy
    }
    //배열에서 회원정보 삭제
    public void removeMember(String inputEmail) {

        //삭제 알고리즘
        int index = findIndex(inputEmail);
        if(index == -1) return;

        for (int i = index; i < members.length -1; i++) {
            members[i] = members[i + 1];
        }
        //마지막 요소 pop 처리
        Member [] temp = new Member[members.length -1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = members[i];
        }
        members = temp;
    }


//    //인덱스 넘버의 email string 이 같은지에 따른
//    void isEmailExist(String targetEmail) {
//        if (isDuplicateEmail(targetEmail)) {
//            return
//        }
//        System.out.println("입력하신 회원 정보가 없습니다.");
}
