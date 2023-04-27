/*
코드업 - 문제집 - 1901 : (재귀 함수) 1부터 n까지 출력하기

문제
1부터 정수 까지 출력하는 재귀함수를 설계하시오.
이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.

입력
정수 n이 입력된다(1 <= n <= 200)

출력
1부터 n까지 한 줄에 하나씩 출력한다.

예제 입력
10

예제 출력
1
2
3
4
5
6
7
8
9
10
*/
package codeup.문제집.재귀함수;

import java.util.Scanner;

public class N1901 {
    static void function(int n) {
        if(n == 0) return;
        function(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(n);
    }
}
