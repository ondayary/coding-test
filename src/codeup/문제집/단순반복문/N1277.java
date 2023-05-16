/*
코드업 - 문제집 - 단순 반복문 - 1277 : 몇 번째 데이터 출력하기

문제
첫 줄에 데이터의 개수 N(N은 홀수)이 입력되고, 그 다음 줄에 N개의 데이터가 입력된다.
여기서 첫번째 데이터, 중간 데이터, 마지막 데이터를 출력하시오.

예)
5
2 4 6 1 7
이면
2 6 7이 출력된다.

(첫번째 데이터 2, 중간 데이터 6, 마지막 데이터 7)

입력
입력으로 N이 주어지고 그 다음줄에 N개의 데이터가 공백으로 구분되어 입력된다.(단, N>=1인 홀수)

출력
첫번째, 중간, 마지막 데이터 값을 출력한다.

예제 입력
7
2 4 7 3 1 2 5

예제 출력
2 3 5
*/
package codeup.문제집.단순반복문;

import java.util.Scanner;

public class N1277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[0] + " " + arr[N/2] + " " + arr[N-1]);
    }
}
