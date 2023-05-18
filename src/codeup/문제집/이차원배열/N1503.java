/*
코드업 - 문제집 - 2차원 배열 - 1503 : 지그재그 입력

문제
하나의 정수N을 입력받아 다음과 같이 작성하시오.
지그재그로 출력하시오.
N이 5라면 다음과 같이 출력한다.

1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25

입력
한개의 정수가 입력된다. (2 <= N <= 50)

출력
N * N 배열을 지그재그 형태로 출력한다. (숫자와 숫자사이는 공백으로 구분한다.)

예제 입력
3

예제 출력
1 2 3
6 5 4
7 8 9
*/
package codeup.문제집.이차원배열;

import java.util.Scanner;

public class N1503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[51][51];
        int cnt = 1;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = cnt++;
                }
            } else if (i % 2 != 0) {
                for (int j = N - 1; j >= 0; j--) {
                    arr[i][j] = cnt++;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
