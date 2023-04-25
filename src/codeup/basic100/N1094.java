/*
코드업 - 문제 - 1094 : [기초-1차원배열] 이상한 출석 번호 부르기2

문제
정보 선생님은 수업을 시작하기 전에 이상한 출석을 부른다.
학생들의 얼굴과 이름을 빨리 익히기 위해 번호를 무작위(랜덤)으로 부르는데,
영일이는 선생님이 부른 번호들을 기억하고 있다가 거꾸로 불러보는 것을 해보고 싶어졌다.
출석 번호를 n번 무작위로 불렀을 때, 부른 번호를 거꾸로 출력해 보자.

입력
번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.

출력
출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.

예제 입력
10
10 4 2 3 6 6 7 9 8 5

예제 출력
5 8 9 7 6 6 3 2 4 10
*/
package codeup.basic100;

import java.util.Scanner;

public class N1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 무작위 부른 n번
        int[] k = new int[n]; // n개의 랜덤 번호

        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(k[i] + " ");
        }
    }
}
