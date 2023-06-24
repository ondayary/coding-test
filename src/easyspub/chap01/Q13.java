/*
연습 1-13

입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 프로그램을 작성하세요.
*/
package easyspub.chap01;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("정사각형을 출력합니다.");

        do {                                     // 조건이 참인 동안 블록 반복
            System.out.print("변의 길이: ");
            n = sc.nextInt();
        } while (n <= 0);                        // n이 0보다 작거나 0이랑 같으면 do-while 루프 반복

        for (int i = 1; i <= n; i++) {           // 정사각형의 행 인덱스 저장
            for (int j = 1; j <= n; j++) {       // 정사각형의 열 인덱스 저장
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
