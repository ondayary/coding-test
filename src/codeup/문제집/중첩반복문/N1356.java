/*
코드업 - 문제집 - 중첩 반복문 - 1356 : 사각형 출력하기 2

문제
길이 n이 입력되면 다음과 같은 사각형을 출력한다.

예)
n이 5일때
*****
*   *
*   *
*   *
*****

입력
길이 n이 입력된다.(n >= 3)

출력
사각형을 출력한다.

예제 입력
3

예제 출력
***
* *
***
*/
package codeup.문제집.중첩반복문;

import java.util.Scanner;

public class N1356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { // 줄의 수 변수인 i
            if (i == 0 || i == n -1) { // 첫번째 줄과 마지막 줄
                for (int j = 0; j < n ; j++) { // 별의 수 변수인 j
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
