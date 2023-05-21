/*
코드업 - 문제집 - 중첩 반복문 - 1370 : 지그재그 출력하기

문제
높이 h와 반복휫수 r이 주어질때, 별을 다음과 같이 지그재그로 출력하자.

예) 3 2
*
 *
  *
 *
*
*
 *
  *
 *
*

입력
높이 h과 반복횟수 r가 한줄에 주어진다.(1<= h, r<=40)

출력
지그재그로 출력한 모습을 출력한다.

예제 입력
3 3

예제 출력
*
 *
  *
 *
*
*
 *
  *
 *
*
*
 *
  *
 *
*
*/
package codeup.문제집.중첩반복문;

import java.util.Scanner;

public class N1370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 높이
        int r = sc.nextInt(); // 반복 횟수

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < j; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            for (int j = h-2; j >= 0 ; j--) {
                for (int k = 0; k < j; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
