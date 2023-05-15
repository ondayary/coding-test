/*
코드업 - 문제집 - 단순 반복문 - 1286 : 최댓값, 최솟값

문제
5개의 정수들의 최댓값과 최솟값을 구하는 프로그램을 작성하라.

입력
5개의 정수가 한 줄에 하나씩 입력된다. (범위: -1,000,000 ~ 1,000,000)

출력
첫째줄에 최댓값을 출력한다.
둘째줄에 최솟값을 출력한다.

예제 입력
3
7
-4
-6
5

예제 출력
7
-6
*/
package codeup.문제집.단순반복문;

import java.util.Scanner;

public class N1286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
