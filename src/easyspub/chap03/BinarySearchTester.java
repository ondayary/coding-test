/*
실습 3-5 Arrays.binarySearch로 이진 검색
*/
package easyspub.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num]; // 요솟수만큼 int형 배열 생성

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: "); // 배열의 첫 요소 입력받기
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]); // 현재 인덱스의 요소가 바로 앞의 요소보다 작으면 다시 입력 받음
        }

        System.out.print("검색할 값: ");
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(x, key); // 배열 x에서 값이 key인 요소 검색

        if (idx < 0) // 인덱스가 음수이면 해당 값이 배열에 없음
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}
