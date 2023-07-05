/*
백준 - 단계별로 풀어보기 - 2차원 배열 - 최댓값

문제
9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.

입력
첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.

출력
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다. 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.

예제 입력
3 23 85 34 17 74 25 52 65
10 7 39 42 88 52 14 72 63
87 42 18 78 53 45 18 84 53
34 28 64 85 12 16 75 36 55
21 77 45 35 28 75 90 76 1
25 87 65 15 28 11 37 28 74
65 27 75 41 7 89 78 64 39
47 47 70 45 23 65 3 41 44
87 13 82 38 31 12 29 29 80

예제 출력
90
5 7
*/
package baekjoon.step.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            String[] strArr = br.readLine().split(" "); // 표준 입력 스트림에서 한 줄을 읽고 공백으로 구분

            for (int j = 0; j < strArr.length; j++) { // str.length는 9
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
            /*
            이 과정을 하는 이유는 9x9 크기의 정수 배열을 입력으로 받아서 가장 큰 값과 그 값이 있는 행과 열을 출력하기 위해서다.
            strArr 배열은 표준 입력 스트림에서 9개의 숫자를 받아서 저장한다. 코드는 strArr 배열의 각 요소를 순회하면서, arr 배열에 정수로 변환하여 저장한다.
            이렇게 하면, arr 배열에는 9x9 크기의 정수 배열이 저장된다. 코드는 arr 배열의 각 요소를 순회하면서, 가장 큰 값을 찾는다. 가장 큰 값을 찾으면, 코드는 그 값이 있는 행과 열을 출력한다.
             */
        }

        int num = 0; // 가장 큰 값을 저장하는 변수

        // arr 배열에서 가장 큰 값이 있는 행과 열을 저장하는 변수
        int row = 0;
        int column = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (num < arr[i][j]) { // 만약 num이 arr[i][j]보다 작다면
                    num = arr[i][j]; // num에 arr[i][j]를 대입
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(num);
        System.out.println((row + 1) + " " + (column + 1)); // +1을 하는 이유는 배열의 인덱스가 0부터 시작하기 때문
    }
}