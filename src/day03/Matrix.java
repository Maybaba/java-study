package day03;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int korScore = 93;
        int engScore = 100;
        int mathScore = 99;

        int[] scoresKim = {korScore, engScore, mathScore};
        int[] scoresPark = {66, 55, 44};
        int[] scoresHong = {77, 88, 99};

        //2차원 배열 : 배열 안의 요소가 또다시 배열인 형태
        int [][] classScores = { scoresKim, scoresHong, scoresPark};

        /*
        {
        {93, 100, 99},
        {66, 55, 44},
        {77, 88, 99},
        }
         */
        System.out.println(" 2차원 배열의 길이 : " + classScores.length);
        System.out.println( classScores[0] == scoresKim);
        System.out.println(classScores[2][1]);

        System.out.println(Arrays.toString(classScores[1]));
        System.out.println(Arrays.deepToString(classScores));

        System.out.println("==========================");

        System.out.println("2차원배열의 2번 인덱스 주소 " +classScores[2]);
        System.out.println("scoresHong 의 주소" + scoresHong);

        System.out.println("==========================");
        //2차원 배열의 순회
        for (int i = 0; i < classScores.length ; i++) {
//            System.out.println(classScores[i]);
            for (int j = 0; j < classScores[i].length; j++) {
                System.out.printf("%d", classScores[i][i]);
            }
            System.out.println();

        }

        //한번에 모든 차원의 배열과 요소 출력 가능 !
        //for ~ of. java : enhanced for loop, itteration, foreach
        System.out.println("=======================");

        for (int[] scores : classScores) {
            for (int n : scores) {
                System.out.printf("%d", n);
            }
            System.out.println();
        }

        System.out.println("=======================");
        int[][] arr2by3 = {
                {10, 20, 30},
                {40, 50, 60}
        };

        int[][] arr4by5 = new int[4][5];
        for (int[] ints : arr4by5) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }

    }
}

