package day06.member;

public class MemberList {
    //깃 레포 참고
        private Member[] mArr;

        private static final int NOT_FOUND = -1;

        MemberList() {
            this.mArr = new Member[0];
        }

        // 맨 끝에 추가
        void push(Member newMember) {
            Member[] temp = new Member[this.mArr.length + 1];
            for (int i = 0; i < this.mArr.length; i++) {
                temp[i] = this.mArr[i];
            }
            temp[temp.length - 1] = newMember;
            this.mArr = temp;
        }
        // 인덱스 찾기
        int findIndex(String email) {
            for (int i = 0; i < this.mArr.length; i++) {
                if (email.equals(mArr[i].email)) {
                    return i;
                }
            }
            return NOT_FOUND;
        }
        // 한 명의 회원 정보 얻기
        Member get(String email) {
            int index = findIndex(email);
            if (index == -1) return null;
            return get(index);
        }
        Member get(int index) {
            return mArr[index];
        }

        // 맨 끝 제거
        private Member pop() {
            // 맨 끝 회원 백업
            Member lastMember = mArr[mArr.length - 1];
            Member[] temp = new Member[mArr.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = mArr[i];
            }
            mArr = temp;
            return lastMember;
        }

        // 회원 정보 삭제
        public Member remove(int index) {
            // 삭제 대상 백업
            Member removedMember = mArr[index];
            for (int i = index; i < mArr.length - 1; i++) {
                mArr[i] = mArr[i + 1];
            }
            pop();
            return removedMember;
        }

        Member remove(Member deleteMember) {
            int index = findIndex(deleteMember.email);
            return remove(index);
        }

        // 배열에 저장된 요소 수 리턴
        int size() {
            return mArr.length;
        }

        // 배열 리턴
        Member[] getMembers() {
            return mArr;
        }
  // 왜 private 으로 잠구고 삭제할 때는 전체삭제가 안되고 하나씩만 삭제가능한거지?
  //아예 접근자체를 막아서 삭제를 못하는 게 아닌가? 기능별로 private을 막아두는건가?
}
