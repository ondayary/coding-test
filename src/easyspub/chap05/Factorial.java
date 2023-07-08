/*
실습 5-1 팩토리얼값을 재귀적으로 구함
*/
package easyspub.chap05;

import java.util.Scanner;

public class Factorial {
    // 음이 아닌 정수 n의 팩토리얼값을 반환
    static int factorial(int n) {
        if (n > 0)
            return n * factorial(n - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();

        System.out.println(x + "의 팩토리얼: " + factorial(x));
    }
}
