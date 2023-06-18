/*
실습 1C-1

3개의 정숫값을 입력하고 중앙값을 구하여 출력
*/
package easyspub.chap01;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b) {

            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else { // b >= c 조건과 a <= c 조건이 모두 거짓이면 c 값이 중앙값
                return c;
            }

        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else { // a > c 조건과 b > c 조건이 모두 거짓이면 b 값이 중앙값
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");

        System.out.print("a의 값: "); int a = stdIn.nextInt();
        System.out.print("b의 값: "); int b = stdIn.nextInt();
        System.out.print("c의 값: "); int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}
