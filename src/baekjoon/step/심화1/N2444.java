/*
백준 - 단계별로 풀어보기 - 심화1 - 별찍기-7

문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력
5

예제 출력
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
package baekjoon.step.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 입력받은 것을 int로 변환 후 N에 저장

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i ; j++) { // j가 1에서 N - i까지 증가할 때마다 실행
                sb.append(" "); // 공백 문자를 sb에 추가
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // j가 1에서 2 * i - 1까지 증가할 때마다 실행
                sb.append("*"); // 별 문자를 sb에 추가
            }
            sb.append("\n"); // 줄 바꿈 문자를 sb에 추가
        }
        for (int i = N - 1; i >= 1; i--) { // i가 N - 1에서 1까지 감소할 때마다 실행
            for (int j = 1; j <= N - i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb); // sb의 내용 출력
    }
}
