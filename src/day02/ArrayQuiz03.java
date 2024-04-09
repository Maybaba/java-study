package day02;

import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {
        //멤버 이름 수정하기, 이름 입력받기 준비
        Scanner scan = new Scanner(System.in);


        //멤버 배열 변수 선언
        String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        //탐색 : 입력받은 멤버가 배열에 있는지 확인, 이름 입력받기
        System.out.println("수정할 멤버의 이름을 입력하세요");
        System.out.print(">>>>");
        String target = scan.nextLine();

        int index= -1; //기본값을 -1 : 해당 값이 index 안에 존재하지 않음
        for (int i = 0; i < students.length ; i++) {
            if(target.equals(students[i])) {
                index = i;
                break;
            }
        }
        //삭제 : 만약 입력받은 값이 있으면 삭제하기
        if(index != -1) {
            System.out.println("새로운 멤버의 이름을 입력하세요");
            System.out.print(">>>>");
            String newTarget = scan.nextLine();

            for (int i = 0; i < students.length ; i++) {
                students[i] = students[i + 1]; //최강창민 자리에 시아준수가 들어가는 것을 표현
            }

            String [] temp = new String[students.length -1];

            for (int i = 0; i < students.length ; i++) {
                temp[i] = students[i];
            }

            } else {
            System.out.printf("%s은 없는 이름입니다. \n", target);
        }


    }
}

/*
package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민",
                "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(tvxq));

        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.printf(">> ");
            String targetName = sc.nextLine();

            //탐색 알고리즘
            int index = -1;
            for (int i = 0; i < tvxq.length; i++) {
                if (targetName.equals(tvxq[i])) {
                    index = i;
                    break;
                }
            }

            //수정 여부 판단
            if (index != -1) {
                System.out.printf("%s의 별명을 변경합니다.\n", targetName);
                System.out.printf(">> ");
                String newName = sc.nextLine();
                tvxq[index] = newName;
                System.out.println("변경 완료!!");
                System.out.println("* 변경 후 정보: " + Arrays.toString(tvxq));
                break;
            } else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
            }
        } //end while
        sc.close();
    } // end main

} // end class
 */
