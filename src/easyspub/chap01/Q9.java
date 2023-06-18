/*
연습 1-9
두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요.
단, 변수 b에 입력한 값이 a값 이하면 변수 b값을 다시 입력하세요. (b > a가 되도록 입력받음)
*/
package easyspub.chap01;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a값: ");
        int a = sc.nextInt();

        int b;
        while (true) { // b값이 a값보다 클 때까지 반복
            System.out.print("b값: ");
            b = sc.nextInt();
            if (b > a) break; // b값이 a값보다 크면 break 명령으로 루프 종료
            System.out.println("a보다 큰 값을 입력하세요!");
        }
        System.out.println("b - a는 " + (b - a) + "입니다.");
    }
}
