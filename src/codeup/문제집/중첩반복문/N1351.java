/*
코드업 - 문제집 - 중첩 반복문 - 1351 : 구구단 출력하기 2

문제
시작단과 마지막 단을 입력하면
그 구간의 구구단을 출력하는 프로그램을 작성하시오.

입력
시작 단과 마지막 단을 입력한다.(정수1~9)

출력
예시처럼 구구단을 출력한다.

예제 입력
5 6

예제 출력
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
6*1=6
6*2=12
6*3=18
6*4=24
6*5=30
6*6=36
6*7=42
6*8=48
6*9=54
*/
package codeup.문제집.중첩반복문;

import java.util.Scanner;

public class N1351 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int last = sc.nextInt();
        for (int i = first; i <= last; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}
