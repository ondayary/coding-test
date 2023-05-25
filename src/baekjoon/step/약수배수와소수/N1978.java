/*
백준 - 단계별로 풀어보기 - 약수,배수와 소수 - 소수 찾기

문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

예제 입력
4
1 3 5 7

예제 출력
3
*/
package baekjoon.step.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N1978 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num;
        int count = 0;

        for (int i = 0; i < N; i++) {
            num = sc.nextInt();
            for (int j = 2; j <= num; j++) { // 2부터 num까지 나누기
                if (j == num) { // 만약 j와 num이 같은 경우 +
                    count++;
                }
                if (num % j == 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
