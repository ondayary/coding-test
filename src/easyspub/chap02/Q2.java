/*
연습 2-2

배열 요소에 값을 입력받아 역순으로 정렬하는 과정을 출력하는 프로그램을 작성하세요.
*/
package easyspub.chap02;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    // 배열 요소 a[idx1]과 a[idx2]를 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        System.out.println(Arrays.toString(a)); // 배열 a의 요소를 출력

        for (int i = 0; i < a.length / 2; i++) { // 배열의 길이의 절반만큼 반복
            /*
            배열의 길이의 절반만큼 반복하는 이유는 배열의 요소를 역순으로 정렬하기 위해서다.
            배열의 첫 번째 요소와 마지막 요소를 교환하고, 두 번째 요소와 두 번째에서 마지막 요소를 교환하고, 그 과정을 배열의 길이의 절반만큼 반복하면 배열의 요소가 역순으로 정렬된다.
             */
            System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]을 교환합니다.");
            swap(a, i, a.length - i - 1); // a[i]와 a[a.length - i - 1]을 교환
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수: ");

        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) { // 배열의 각 요소 입력 받음
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        reverse(x);
        System.out.println("역순 정렬이 끝났습니다.");

    }
}
/*
요솟수: 4
x[0]: 3
x[1]: 5
x[2]: 2
x[3]: 9
[3, 5, 2, 9]
a[0]와 a[3]을 교환합니다.
[9, 5, 2, 3]
a[1]와 a[2]을 교환합니다.
[9, 2, 5, 3]
역순 정렬이 끝났습니다.
 */