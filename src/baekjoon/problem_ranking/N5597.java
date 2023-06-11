/*
백준 - 문제 순위 - 과제 안 내신 분..?

문제
X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

입력
입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.

출력
출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.

예제 입력
3
1
4
5
7
9
6
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30

예제 출력
2
8
*/
package baekjoon.problem_ranking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31]; // boolean 배열은 31개의 요소를 포함

        for (int i = 0; i < 28; i++) { // 0~27, 28개
            int n = Integer.parseInt(br.readLine()); // 문자열을 읽어 int로 변환
            arr[n] = true; // arr 배열의 n번째 요소를 true로 설정
        }
        for (int i = 1; i <= 30; i++) {
            if (!arr[i]) { // arr 배열의 i번쨰 요소가 false인 경우 if 실행
                System.out.println(i);
            }
        }
    }
}
