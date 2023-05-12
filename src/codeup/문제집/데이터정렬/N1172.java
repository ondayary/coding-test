/*
코드업 - 문제집 - 데이터 정렬 - 1172 : 세 수 정렬하기

문제
세 수를 오름차순으로 정렬하려고 한다. (낮은 숫자 -> 높은 숫자)

입력
세 정수가 입력된다.

출력
낮은 숫자 부터 출력한다.

예제 입력
8 7 6

예제 출력
6 7 8
*/
package codeup.문제집.데이터정렬;

import java.util.Scanner;

public class N1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp;
        if (a >= b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b >= c) {
            temp = c;
            c = b;
            b = temp;
        }
        if (a >= b) {
            temp = b;
            b = a;
            a = temp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
