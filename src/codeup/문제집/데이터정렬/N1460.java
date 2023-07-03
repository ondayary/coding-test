/*
코드업 - 문제집 - 2차원 배열 - 2차원 배열 순서대로 채우기 1-1

문제
다음과 같은 n*n 배열 구조를 출력해보자.

입력이 3인 경우 다음과 같이 출력한다.
1 2 3
4 5 6
7 8 9

입력이 n인 경우의 2차원 배열을 출력해보자.

입력
첫 번째 줄에 배열의 크기 n이 입력된다.
[입력값의 정의역]
1<= n <= 100

출력
n*n 크기의 배열을 설명과 같이 채워 출력한다.

예제 입력
4

예제 출력
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
*/
package codeup.문제집.데이터정렬;

import java.util.Scanner;

public class N1460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int cnt = 1; // 배열의 각 요소에 순차적으로 값을 할당하는 데 사용

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] += cnt;
                System.out.print(arr[i][j] + " ");
                cnt++;
                /*
                for 루프가 첫 번째 반복될 때 i는 0이고, j는 0이다.
                arr[i][j] += cnt;는 arr[0][0]에 cnt의 값을 더한다.
                cnt의 값은 1이므로 arr[0][0]의 값은 1이 된다.
                System.out.print(arr[i][j] + " ");는 arr[0][0]의 값을 출력한다.
                cnt++는 cnt의 값을 1 증가시킨다.

                for 루프가 두 번째 반복될 때 i는 0이고, j는 1이다.
                arr[i][j] += cnt;는 arr[0][1]에 cnt의 값을 더한다.
                cnt의 값은 2이므로 arr[0][1]의 값은 2가 된다.
                System.out.print(arr[i][j] + " ");는 arr[0][1]의 값을 출력한다.
                cnt++는 cnt의 값을 1 증가시킨다.
                ...
                 */
            }
            System.out.println();
        }
    }
}
