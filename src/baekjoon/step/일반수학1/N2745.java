/*
백준 - 단계별로 풀어보기 - 일반 수학1 - 진법 변환

문제
B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

입력
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

출력
첫째 줄에 B진법 수 N을 10진법으로 출력한다.

예제 입력
ZZZZZ 36

예제 출력
60466175
*/
package baekjoon.step.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 숫자를 문자열로 읽음
        StringTokenizer st = new StringTokenizer(br.readLine()); // 문자열을 토큰으로 분리

        String N = st.nextToken(); // B진법 수인 첫 번째 토큰을 N에 저장
        int B = Integer.parseInt(st.nextToken()); // 두 번째 토큰 B에 저장
        br.close();

        int tmp = 1;
        int sum = 0;

        for (int i = N.length() - 1; i >= 0; i--) { // N문자열의 맨 오른쪽부터 한 글자씩 읽고, 해당 글자를 정수로 변환하여 sum에 더함
            char ch = N.charAt(i); // N문자열의 i번째 글자를 저장
            if ('A' <= ch && ch <= 'Z') {
                sum = sum + (ch - 'A' + 10) * tmp;
            } else {
                sum = sum + (ch - '0') * tmp;
            }
            tmp = tmp * B;
        }
        System.out.println(sum);
    }
}
