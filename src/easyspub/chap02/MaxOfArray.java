/*
실습 2-3

배열 요소의 최댓값 출력(값을 입력받음)
*/
package easyspub.chap02;

import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int[] a) {                       // maxOf() 메서드에 전달되는 인수의 목록, maxOf() 메서드는 배열 a의 최댓값을 반환함
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];                           // 배열 a의 최댓값을 저장하는데 사용
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");

        int num = sc.nextInt();

        int[] height = new int[num];

        for (int i = 0; i < num; i++) {               // i 변수는 배열 height의 인덱스를 저장, num은 배열 height의 길이를 저장
            System.out.print("height[" + i + "]: ");
            height[i] = sc.nextInt();
        }
        System.out.println("최댓값: " + maxOf(height));
    }
}
