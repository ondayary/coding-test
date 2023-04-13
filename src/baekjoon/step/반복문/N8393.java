/**
 * 백준 - 단계별로 풀어보기 - 반복문 - 합
 *
 * 문제
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *
 * 출력
 * 1부터 n까지 합을 출력한다.
 *
 * 예제 입력
 * 3
 *
 * 예제 출력
 * 6
 */

package baekjoon.step.반복문;

import java.util.Scanner;

public class N8393 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int sum = 0; // 합을 구하는 변수
        for (int i = 1; i <= n; i++) { // n까지 구해야 하는 것이라서 <= 사용
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
