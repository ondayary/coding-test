/*
코드업 - 문제집 - 스택 - 1402 : 거꾸로 출력하기 3

문제
데이터의 개수가 n개가 들어오고, n개의 데이터를 거꾸로 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 데이터의 개수 n이 입력된다. ( n <= 1,000 )
둘째 줄에 공백을 기준으로 n개 데이터가 입력된다.

출력
n개의 데이터를 입력의 역순으로 출력한다.

예제 입력
5
1 3 5 6 8

예제 출력
8 6 5 3 1
*/
package codeup.문제집.스택;

import java.util.Scanner;

public class N1402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0 ; i--) { // n-1부터 0까지 반복, 입력받은 숫자의 -1(index)
            System.out.print(arr[i] + " ");
        }
    }
}
