/*
백준 - 단계별로 풀어보기 - 약수,배수와 소수 - 소인수분해

문제
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

출력
N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.

예제 입력
72

예제 출력
2
2
2
3
3
*/
package baekjoon.step.약수배수와소수;

import java.util.Scanner;

public class N11653 {
    public static void main(String[] args) {
        // 소인수분해 : 어떤 수를 소수인 인수로 분해하는 것
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                System.out.println(i);
                N = N / i;
            }
        }
        if (N != 1) {
            System.out.println(N);
        }
    }
}
