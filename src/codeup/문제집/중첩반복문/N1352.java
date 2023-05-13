/*
코드업 - 문제집 - 중첩 반복문 - 1352 : 사각형 출력하기 1

문제
길이 n이 입력되면 길이가 n인 사각형을 출력하시오.
단, 사각형은 * 모양으로 채운다.

입력
사각형의 길이 n이 입력된다.

출력
가로 세로 길이 n인 사각형을 출력한다.

예제 입력
4

예제 출력
****
****
****
****
*/
package codeup.문제집.중첩반복문;

import java.util.Scanner;

public class N1352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
