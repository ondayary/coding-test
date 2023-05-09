/*
코드업 - 문제집 - 1차원 배열 - 1405 : 숫자 로테이션

문제
n개의 숫자가 입력되면, n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오.

입력
첫째 줄에 숫자의 개수 n이 입력된다.(1 <= n <= 1,000)
둘째 줄에 n개의 정수 k가 공백으로 구분되어 입력된다.(1 <= k <= 1,000)

출력
숫자를 로테이션한 결과를 출력한다.(단, 왼쪽으로만 돌린다.)

예제 입력
5
1 2 3 4 5

예제 출력
1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4
*/
package codeup.문제집.일차원배열;

import java.util.Scanner;

public class N1405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k = new int[n]; // n개의 정수 k가 공백으로 구분되어 입력
        for (int i = 0; i < k.length; i++) {
            k[i] = sc.nextInt();
        }

        for (int i = 0; i < k.length; i++) {
            for (int j = i; j < k.length; j++) {
                System.out.print(k[j] + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(k[j] + " ");
            }
            System.out.println();
        }
    }
}
