/*
연습 1-2

세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
작성한 메서드를 테스트하기 위해 main 메서드를 포함한 프로그램을 작성해야 합니다.
*/
package easyspub.chap01;

import java.util.Scanner;

public class Q2 {
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("세 값의 최솟값을 구합니다.");
        System.out.print("a의 값: "); a = sc.nextInt();
        System.out.print("b의 값: "); b = sc.nextInt();
        System.out.print("c의 값: "); c = sc.nextInt();

        int min = min3(a, b, c); // min3() 메서드를 호출하여 a, b, c 세 개의 int 값의 최솟값을 구함. min 변수는 min3() 메서드의 반환값을 저장

        System.out.println("최솟값: " + min);
    }
}
