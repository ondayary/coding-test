/*
연습 1-6

1, 2, ..., n의 총합을 구합니다.
while 문이 종료될 때 변수 i값을 출력하는 프로그램을 작성하세요.
*/
package easyspub.chap01;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1에서 n까지의 총합을 구합니다.");
        System.out.print("n의 값 : ");

        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= n) { // i가 n이하면 반복
            sum += i;
            i++;
        }
        System.out.println("1에서 " + n + "까지의 총합은 " + sum + "입니다.");
        System.out.println("i의 값은 " + i + "입니다.");
    }
}
