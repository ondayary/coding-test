/*
연습 1-1

네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
작성한 메서드를 테스트하기 위해 main 메서드를 포함한 프로그램을 작성해야 합니다.
*/
package easyspub.chap01;

import java.util.Scanner;

public class Q1 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("네 값의 최댓값을 구합니다.");
        System.out.print("a의 값: "); a = sc.nextInt();
        System.out.print("b의 값: "); b = sc.nextInt();
        System.out.print("c의 값: "); c = sc.nextInt();
        System.out.print("d의 값: "); d = sc.nextInt();

        int max = max4(a, b, c, d); // max4() 메서드를 호출하여 a, b, c, d 네 개의 int 값의 최댓값을 구함. max 변수는 max4() 메서드의 반환값을 저장

        System.out.println("최댓값: " + max);
    }
}
