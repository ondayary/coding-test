/*
실습 1-14

*을 n개 출력하되 w개마다 줄 바꿈
*/
package easyspub.chap01;

import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, w;

        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        do { // 별의 개수가 0보다 작을 때까지 반복하여 다시 입력받음
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0); // do 루프의 조건을 나타냄. n이 0보다 클 때까지 반복

        do {
            System.out.print("w값: ");
            w = stdIn.nextInt();
        } while (w <= 0 || w > n); // 입력한 줄 바꿈의 개수가 0보다 작거나, 별의 개수보다 클 때까지 반복하여 다시 입력 받음

        for (int i = 0; i < n; i++) {
            System.out.print("*"); // 별의 개수만큼 반복하여 별 출력
            if (i % w == w - 1) { // 줄 바꿈의 개수로 나눈 나머지가 줄 바꿈의 개수 - 1일 때 줄바꿈
                System.out.println();
            }
        }
        if (n % w != 0) { // 별의 개수가 줄 바꿈의 개수의 배수가 아닐 경우, 줄 바꿈을 한 번 더 함
            System.out.println();
        }
    }
}
