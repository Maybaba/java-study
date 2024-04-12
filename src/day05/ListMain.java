package day05;

public class ListMain {
    public static void main(String[] args) {
        StringList foods = new StringList();
        StringList userNames = new StringList();

        // 배열 내부 데이터 수 확인
//        System.out.println(foods.length); length는 배열만 쓸 수 있다.
//        지금 사용한 코드는 객체에 배열길이를 구하는 것이라 오류가 난다.
//                그래서 대신 아래와 같이 코드를 확인할 수 있다.
//        System.out.println(foods.size()); 안됨

        //배열에 데이터 추가
        foods.push("짬뽕");
        foods.push("불고기와퍼");

        userNames.push("박영히히");

        //자료삭제
        foods.remove("짬뽕");

        //자료 중간 삽입
        userNames.push("김철수");
        userNames.push("김dugml");

        userNames.insert(1, "뽐로롤");
        foods.insert(1, "마라탕");

        //배열 데이터 수정
        foods.set(0, "김치볶음밥밥밥"); // 0번 인덱스가 수정되어야 함
        userNames.set(1, "배배ㅐㅂ");

//        //배열 데이터 전체 삭제
        foods.clear(); //foods 배열 내부 전체삭제, size = 0
//
//        //배열 데이터가 한개라도 있는지 확인
       foods.isEmpty(); // 배열이 비어있으면 true 아니면 false 반환

        //초기 배열에 생성자에 전달한 데이터들이 들어있어야 함
        StringList hobbies = new StringList("축구", "영화감상", "음악감상");

        hobbies.push("불멍때리기");

        //[축구, 영화감상, 음악감상, 멍때리기]
        System.out.println("hobbies = " + hobbies);

        System.out.println("foods = " + foods);
        System.out.println("userNames = " + userNames);

    }
    // 배열 내부 요소의 수를 알려주는 메서드 안됨
//    int size() {
//        return sArr.length;
//    }
}
