/*
연습 2-4

배열b의 모든 요소를 배열 a에 복사하는 메서드를 만들어 출력하는 프로그램을 작성하세요.
*/
package easyspub.chap02;

import java.util.Scanner;

public class Q4 {

    // 배열 b의 모든 요소를 배열 a에 copy
    static void copy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length; // 배열 a의 길이가 배열 b의 길이보다 작거나 같으면 배열 a의 길이를, 그렇지 않으면 배열 b의 길이를 변수 num에 저장
        for (int i = 0; i < num; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a의 요솟수: ");
        int numA = sc.nextInt();
        int[] a = new int[numA];

        for (int i = 0; i < numA; i++) { // 배열 a의 모든 요소를 입력받음
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("b의 요솟수: ");
        int numB = sc.nextInt();
        int[] b = new int[numB];

        for (int i = 0; i < numB; i++) { // 배열 b의 모든 요소를 입력받음
            System.out.print("b[" + i + "]: ");
            b[i] = sc.nextInt();
        }

        copy(a, b); // 배열 b의 모든 요소를 배열 a에 복사

        System.out.println("배열 b의 모든 요소를 배열 a에 copy 완료.");
        for (int i = 0; i < numA; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}