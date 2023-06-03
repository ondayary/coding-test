/*
백준 - 단계별로 풀어보기 - 심화2 - 인사성 밝은 곰곰이

문제
알고리즘 입문방 오픈 채팅방에서는 새로운 분들이 입장을 할 때마다 곰곰티콘을 사용해 인사를 한다. 이를 본 문자열 킬러 임스는 채팅방의 기록을 수집해 그 중 곰곰티콘이 사용된 횟수를 구해 보기로 했다.
ENTER는 새로운 사람이 채팅방에 입장했음을 나타낸다. 그 외는 채팅을 입력한 유저의 닉네임을 나타낸다. 닉네임은 숫자 또는 영문 대소문자로 구성되어 있다.
새로운 사람이 입장한 이후 처음 채팅을 입력하는 사람은 반드시 곰곰티콘으로 인사를 한다. 그 외의 기록은 곰곰티콘을 쓰지 않은 평범한 채팅 기록이다.
채팅 기록 중 곰곰티콘이 사용된 횟수를 구해보자!

입력
첫 번째 줄에는 채팅방의 기록 수를 나타내는 정수 N이 주어진다. (1 <= N <= 100,000)
두 번째 줄부터 N개의 줄에 걸쳐 새로운 사람의 입장을 나타내는 ENTER, 혹은 채팅을 입력한 유저의 닉네임이 문자열로 주어진다. (1 <= 문자열길이 <= 20)
첫 번째 주어지는 문자열은 무조건 ENTER이다.

출력
채팅 기록 중 곰곰티콘이 사용된 횟수를 출력하시오.

예제 입력
9
ENTER
pjshwa
chansol
chogahui05
lms0806
pichulia
r4pidstart
swoon
tony9402

예제 출력
8
*/
package baekjoon.step.심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class N25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 사용자로부터 정수 N을 읽음 (문자열을 정수로 변환)
        int answer = 0;

        HashSet<String> set = new HashSet<>(); // 문자열 저장, 중복 요소를 허용하지 않는 Collection
        while (N --> 0) { // N이 0이 될 때까지 N을 1씩 감소시키면서 반복
            String str = br.readLine();
            if (str.equals("ENTER")) {
                answer = answer + set.size(); // set 객체의 크기는 answer 변수에 더함
                set.clear(); // set 객체 지움
                continue; // 루프를 다음 반복으로 계속하도록 지시함
            }
            set.add(str); // 문자열 str을 set객체에 추가
        }
        System.out.print(answer + set.size()); // answer 변수의 값과 set 객체의 크기 출력
    }
}
