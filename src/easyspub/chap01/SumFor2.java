/*
실습 1-9
양수만 입력받아 1부터 n까지의 합 구하기
프로그램을 실행하고 0이나 음숫값을 입력하면 다시 'n값: '이 출력되며 사용자에게 새로 입력할 것을 요구한다.

사전판단반복(while문, for문) : 루프 본문을 한 번도 실행하지 않을 수 있다.
사후판단반복(do while문) : 루프 본문을 한 번은 반드시 실행해야 한다.
*/
package easyspub.chap01;

import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0); // do 루프의 조건을 나타냄. n이 0보다 클 때까지 반복

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // i가 1부터 n까지 증가할 때마다 sum에 i를 더함
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
