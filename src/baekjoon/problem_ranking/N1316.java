/*
백준 - 문제 순위 - 그룹 단어 체커

문제
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

출력
첫째 줄에 그룹 단어의 개수를 출력한다.

예제 입력
9
aaa
aaazbz
babb
aazz
azbz
aabbaa
abacc
aba
zzaz

예제 출력
2
*/
package baekjoon.problem_ranking;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class N1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            boolean[] check = new boolean[26]; // 알파벳의 개수인 26개의 boolean 배열 check를 생성
            boolean tmp = true; // 임시 변수 tmp를 true로 초기화

            for (int j = 0; j < str.length(); j++) {
                int index = str.charAt(j) - 'a'; // str의 j번째 문자를 아스키 코드로 변환하고 'a'에서 뺀 값을 index에 저장
                if (check[index]) { // 이전에 사용한 적이 있는 문자라면
                    if (str.charAt(j) != str.charAt(j - 1)) { // str의 j번째 문자와 j - 1번째 문자가 다르면, 이전 문자와 연속되지 않으면
                        tmp = false; // 그룹 단어가 아님
                        break;
                    }
                } else { // 이전에 사용한 적이 없는 문자라면
                    check[index] = true; // 문자 사용 체크
                }
            }
            if (tmp) cnt++; // tmp가 true이면 cnt를 1 증가
        }
        System.out.println(cnt);
    }
}
