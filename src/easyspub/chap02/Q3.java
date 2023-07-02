/*
연습 2-3

배열의 모든 요소의 합계값을 구하여 출력하는 프로그램을 작성하세요.
*/
package easyspub.chap02;

import java.util.Scanner;

public class Q3 {

    // 배열 a의 요솟값 출력
    static int sumOf(int[] a) { // 정수 배열 a의 요솟값의 합계를 반환하는 정수 함수 sumOf를 선언
        int sum = 0;
        for (int i = 0; i < a.length; i++) { // 배열 a의 길이만큼 반복
            sum += a[i]; // 변수 sum에 배열 a의 요솟값을 더함
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수: ");

        int num = sc.nextInt(); // 키보드로 입력한 요솟수를 변수 num에 저장
        int[] a = new int[num]; // 배열 a를 생성하고 요솟수를 num으로 설정

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt(); // 키보드로 입력한 값을 배열 a의 요솟값으로 설정
        }
        System.out.println("모든 요소의 합계: " + sumOf(a));
    }
}