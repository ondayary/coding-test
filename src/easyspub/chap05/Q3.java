/*
연습 5-3 배열 a의 모든 요소의 최대공약수를 구하는 다음 메서드를 작성하세요.
static int gcdArray(int[] a)
*/
package easyspub.chap05;

import java.util.Scanner;

public class Q3 {
    // 정숫값 x, y의 최대 공약수를 비재귀적으로 구하여 반환
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return (x);
    }

    // 요솟수가 n인 배열 a의 모든 요소의 최대 공약수를 구함
    static int gcdArray(int[] a, int start, int no) {
        if (no == 1)
            return a[start];
        else if (no == 2)
            return gcd(a[start], a[start + 1]);
        else
            return gcd(a[start], gcdArray(a, start + 1, no - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("최대 공약수 구할 정수 갯수 입력: ");

        int num;
        do {
            num = sc.nextInt();
        } while (num <= 1);

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.println("최대공약수: " + gcdArray(x, 0, num));
    }
}
