/*
코드업 - 문제집 - 단순 반복문 - 1287 : 구구단을 *로 출력하기

문제
구구단을 입력받아 *로 출력하라.

입력
n단이 입력된다.(1 <= n <= 9)

출력
출력예시를 참고하여 구구단을 *로 출력한다.

예제 입력
2

예제 출력
**
****
******
********
**********
************
**************
****************
******************
*/
package codeup.문제집.단순반복문;

import java.util.Scanner;

public class N1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < i * n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
