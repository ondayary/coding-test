/*
코드업 - 문제집 - 2차원 배열 - 1502 : 2차원 배열 채우기 2

문제
n이 입력되면 크기가 n인 다음과 같은 2차원 배열을 출력하시오.

입력 예)
3
출력 예)
1 4 7
2 5 8
3 6 9

입력
2차원 배열의 크기 n이 입력된다.(n<=50)

출력
크기 n인 배열을 출력한다.

예제 입력
2

예제 출력
1 3
2 4
*/
package codeup.문제집.이차원배열;

import java.util.Scanner;

public class N1502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n]; // 2차원 정수 배열 생성 후 n행 n열로 초기화
        int cnt = 1;

        // 중첩 반복문을 사용하게 되면 배열의 모든 요소를 반복할 수 있다.
        for (int i = 0; i < n; i++) { // 행 인덱스
            for (int j = 0; j < n; j++) { // 열 인덱스
                arr[j][i] = cnt++; // i와 j가 0에서 n-1 사이일 때, cnt를 저장 후 1 증가
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
