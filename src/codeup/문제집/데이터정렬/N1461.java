/*
코드업 - 문제집 - 2차원 배열 - 2차원 배열 순서대로 채우기 1-2

문제
다음과 같은 n*n 배열 구조를 출력해보자.

입력이 3인 경우 다음과 같이 출력한다.
3 2 1
6 5 4
9 8 7

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
4 3 2 1
8 7 6 5
12 11 10 9
16 15 14 13
*/
package codeup.문제집.데이터정렬;

import java.util.Scanner;

public class N1461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int cnt = n;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] += cnt; // arr의 각 요소에 cnt값을 더한다.
                System.out.print(arr[i][j] + " ");
                cnt--; // 각 반복마다 1씩 감소한다. 배열 arr의 값이 바깥쪽에서 안쪽으로 이동할 때 숫자가 감소하기 때문이다.
            }
            cnt = n; // 반복이 끝난 후 cnt는 다시 n으로 설정된다. 이것은 배열 arr의 값이 한 행의 끝에 도달하면 패턴의 시작 부분에서 숫자가 다시 시작되기 때문이다.
            cnt *= i + 2;
            /*
            반복문의 첫 번째 행(i=0)에서 cnt는 n의 값을 그대로 가지게 된다.
            그러나 두 번째 행(i=1)에서는 cnt에 (i+2)값을 곱하여 값을 조정한다.
            세 번째 행(i=2)에서는 cnt에 (i+2)값을 다시 곱하여 값을 조정하고, 이와 같은 식으로 반복된다.
            각 행은 이전 행의 마지막 숫자에서부터 시작하며 cnt 값을 조정하여 다음 행의 시작 숫자를 결정한다.
             */
            System.out.println();
        }
    }
}
/*
입력: 4

n 값을 입력 받고 cnt 변수를 n으로 초기화한다.
n = 4
cnt = 4

2차원 배열 arr을 생성하고 각 요소에 cnt 값을 더하고 출력한다.
4 4 4 4

cnt 값을 다시 n으로 초기화한다.
cnt = 4

cnt를 (i+2)와 곱하여 cnt 값을 조정한다.
첫 번째 행(i=0)에서는 cnt에 (i+2)인 2를 곱하므로 cnt는 4 * 2 = 8이 된다.
cnt = 8

2차원 배열 arr을 생성하고 각 요소에 cnt 값을 더하고 출력한다.
8 8 8 8

cnt 값을 다시 n으로 초기화한다.
cnt = 4

cnt를 (i+2)와 곱하여 cnt 값을 조정한다.
두 번째 행(i=1)에서는 cnt에 (i+2)인 3를 곱하므로 cnt는 4 * 3 = 12가 된다.
cnt = 12

2차원 배열 arr을 생성하고 각 요소에 cnt 값을 더하고 출력한다.
12 12 12 12
...
 */
