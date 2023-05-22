/*
코드업 - 문제집 - 중첩 반복문 - 1371 : 마름모 출력하기

문제
마름모를 출력해보자.
n이 입력되면 대각선 2개의 길이가 2n인 마름모를 출력하시오.

입력
정수 n이 입력된다. ( 2 <= n <= 100 )

출력
대각선 2개의 길이가 2n인 마름모를 출력한다.

예제 입력
5

예제 출력
    **
   *  *
  *    *
 *      *
*        *
*        *
 *      *
  *    *
   *  *
    **
*/
package codeup.문제집.중첩반복문;

import java.util.Scanner;

public class N1371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = n-1; j > i; j--) {
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
