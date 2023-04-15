/*
백준 - 단계별로 풀어보기 - 1차원 배열 - 최댓값

문제
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
예를 들어, 서로 다른 9개의 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61
이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

입력
첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

출력
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

예제 입력
3
29
38
12
57
74
40
85
61

예제 출력
85
8
*/
package baekjoon.step.일차원배열;

import java.util.Scanner;

public class N2562 {
    public static void main(String[] args) {
        // 9개 숫자를 입력받음
        // 9개 숫자중 최댓값을 첫째 줄에 출력
        // 몇번째 숫자인지 두 번째 줄에 출력
        Scanner in = new Scanner(System.in);
        int[] arr = new int[9];
        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}