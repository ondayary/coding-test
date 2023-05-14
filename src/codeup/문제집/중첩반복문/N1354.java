/*
코드업 - 문제집 - 중첩 반복문 - 1354 : 삼각형 출력하기 2

문제
길이 n이 입력되면 역삼각형을 출력한다.
예)
n이 5이면
*****
****
***
**
*

입력
길이 n이 입력된다.

출력
역삼각형을 출력한다.

예제 입력
3

예제 출력
***
**
*
*/
package codeup.문제집.중첩반복문;

import java.util.Scanner;

public class N1354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
