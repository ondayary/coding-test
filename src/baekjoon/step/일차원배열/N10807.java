/*
백준 - 단계별로 풀어보기 - 1차원 배열 - 개수 세기

문제
총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

출력
첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

예제 입력
11
1 4 1 2 4 2 4 2 3 4 4
2

예제 출력
3
*/

package baekjoon.step.일차원배열;

import java.util.Scanner;

public class N10807 {
    public static void main(String[] args) {
        // 첫째 줄에 N 개의 정수
        // N 개만큼 정수 입력(공백으로 나눔)
        // 세 번째 줄에 입력으로 주어진 N개의 정수와 같은 정수가 몇 개 인지 결과를 출력
        Scanner in = new Scanner(System.in);

        int count = 0; // input과 일치할 경우 카운트를 세주는 변수
        int N = in.nextInt(); // 첫째 줄 입력할 변수
        int[] arr = new int[N]; // N개 만큼의 배열 생성

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int input = in.nextInt(); // 세번째 줄 입력할 변수
        for (int j = 0; j < arr.length; j++) { // 배열의 길이만큼 반복문이 돌면서 input과 같은 숫자 찾음
            if(input == arr[j]) count++;
        }
        System.out.println(count);
    }
}
