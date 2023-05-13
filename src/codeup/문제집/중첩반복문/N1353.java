/*
코드업 - 문제집 - 중첩 반복문 - 1353 : 삼각형 출력하기 1

문제
n이 입력되면 다음과 같은 삼각형을 출력하시오.
예)
n 이 5 이면
*
**
***
****
*****

입력
길이 n이 입력된다.

출력
삼각형을 출력한다.

예제 입력
3

예제 출력
*
**
***
*/
package codeup.문제집.중첩반복문;

import java.util.Scanner;

public class N1353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
