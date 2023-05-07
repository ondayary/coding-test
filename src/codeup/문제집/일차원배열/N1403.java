/*
코드업 - 문제집 - 1차원 배열 - 1403 : 배열 두번 출력하기

문제
k개의 숫자를 입력받고 그 숫자들을 두번 출력하시오.

입력
첫 줄에 k가 입력된다.(k<=100)
둘째 줄에 k개의 정수들이 공백으로 구분되어 입력된다.

출력
k개의 숫자를 입력받은 순서대로 한 줄에 하나씩 출력한다. 그리고 한번 출력이 다 되면 다시 한번더 출력한다.(총 2번)

예제 입력
3
1 2 3

예제 출력
1
2
3
1
2
3
*/
package codeup.문제집.일차원배열;

import java.util.Scanner;

public class N1403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }
        }
    }
}
