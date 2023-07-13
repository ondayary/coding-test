/*
실습 6-1 버블 정렬(버전1)
*/
package easyspub.chap06;

import java.util.Scanner;

public class BubbleSort {

    // 배열 a의 idx1 인덱스와 idx2 인덱스의 값 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 버블 정렬
    static void bubbleSort(int[] a, int n) { // 배열 a정렬, n은 배열의 요소수
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j])
                    swap(a, j - 1, j); // 배열 a의 j - 1 인덱스와 j 인덱스에 해당하는 요소의 값 교환
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전1)");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx); // 배열 x 정렬

        System.out.println("오름차순으로 정렬 완료");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]= " + x[i]);
        }
    }
}