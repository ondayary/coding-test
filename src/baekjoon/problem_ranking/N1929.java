/*
백준 - 문제 순위 - 소수 구하기

문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

예제 입력
3 16

예제 출력
3
5
7
11
13
*/
package baekjoon.problem_ranking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1929 {
    public static void main(String[] args) throws IOException {
        // 에라토스테네스의 체
        // 2부터 N까지의 모든 수를 나열한 후, 2부터 시작하여 2의 배수들을 모두 지우는 방법으로 소수를 찾는 알고리즘

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // br에서 읽은 문자열을 토큰으로 나눔

        // M이상 N이하의 소수를 구하기 위해 입력 받음
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[N + 1]; // arr[i]는 i가 소수이면 false
        arr[0] = arr[1] = true; // arr[0]과 arr[1]은 소수가 아님
        
        for (int i = 2; i <= N; i++) {
            if (arr[i] == true) { // arr[i]가 true이면 i는 소수가 아님
                continue; // for문을 종료하지 않고 다음 루프 실행
            }
            for (int j = i + i; j <= N; j = j + i) { // j는 i의 배수들을 검사하는 변수, arr은 소수 여부를 저장하는 배열
                arr[j] = true; // j가 소수가 아니라면 arr[j]를 true로 설정
            }
        }
        for (int i = M; i <= N; i++) {
            if (arr[i] == false) { // arr[i]가 false이면 i는 소수이므로 출력
                System.out.println(i);
            }
        }
    }
}
