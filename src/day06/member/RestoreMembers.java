package day06.member;

import java.util.Arrays;

public class RestoreMembers {
    //filed
    static RestoreMembers[] restoreMemberList; // 휴지통 개념 (복구 시 재정렬 : 후순위)

    //restoreList 배열 안의 new restoreMembers 객체
    RestoreMembers() {
        this.restoreMemberList = new RestoreMembers[0]; //start from empty array
    }

    //deletedMember를 빈 restore 배열에 push 하기
    RestoreMembers backupMember(RestoreMembers deletedMember) { //param을 객체로 받기
        //push copy - paste members array
        RestoreMembers[] temp = new RestoreMembers[restoreMemberList.length +1];
        for (int i = 0; i < restoreMemberList.length; i++) {
            temp[i] = restoreMemberList[i];
        }
        temp[temp.length -1] = deletedMember;
        restoreMemberList = temp;

        System.out.println("restore list = " + Arrays.toString(restoreMemberList));
        System.out.println("deletedMember = " + deletedMember);

        return deletedMember;
    }
}
