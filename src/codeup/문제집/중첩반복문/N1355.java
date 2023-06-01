/*
코드업 - 문제집 - 중첩 반복문 - 1355 : 삼각형 출력하기 3

문제
길이 n이 입력되면 다음과 같은 역삼각형을 출력한다.
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

public class N1355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { // 줄 수 i를 n 만큼 반복
            for (int j = 0; j < i; j++) { // 공백 수를 정하는 변수 j
                System.out.print(" "); // i 변수의 값만큼 공백을 출력함
            }
            for (int k = n; k > i; k--) { // 별 수를 정하는 변수 k
                System.out.print("*"); // n에서 i를 뺀 값만큼 별을 출력함
            }
            System.out.println();
        }
    }
}
