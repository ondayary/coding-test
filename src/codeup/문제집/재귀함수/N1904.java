/*
코드업 - 문제집 - 1904 : (재귀함수) 두 수 사이의 홀수 출력하기

문제
시작수(a)와 마지막 수(b)가 입력되면 a부터 b까지의 모든 홀수를 출력하시오.
이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.

입력
두 수 a, b가 입력된다(1 <= a <= b <= 100)

출력
a~b의 홀수를 모두 출력한다.

예제 입력
2 7

예제 출력
3 5 7
*/
package codeup.문제집.재귀함수;

import java.util.Scanner;

public class N1904 {
    static void function(int a, int b) { // a에서 b까지의 홀수만 출력하는 함수
        if (a > b) return;
        if (a % 2 == 1) { // 홀수인 경우
            System.out.print(a + " "); // a를 출력 후 함수를 재귀적으로 호출 = 함수는 자기 자신을 호출함
        }
        function(a + 1, b); // 함수는 이 과정을 반복하여 a가 b보다 작아질 때까지 반복
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        function(a, b);
    }
}
