/*
코드업 - 문제집 - 2차원 배열 - 1501 : 2차원 배열 채우기 1

문제
n이 입력되면 크기가 n인 다음과 같은 2차원 배열을 출력하시오.

입력 예)
3
출력 예)
1 2 3
4 5 6
7 8 9

입력
2차원 배열의 크기 n이 입력된다.(n<=50)

출력
크기 n인 배열을 출력한다.

예제 입력
2

예제 출력
1 2
3 4
*/
package codeup.문제집.이차원배열;

import java.util.Scanner;

public class N1501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n]; // n행 n열
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = cnt++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
