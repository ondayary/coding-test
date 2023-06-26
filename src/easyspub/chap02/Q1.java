/*
연습 2-1

키와 사람 수를 난수로 생성하여 배열 요소의 최대값을 출력하는 프로그램을 작성하세요.
*/
package easyspub.chap02;

import java.util.Random;

public class Q1 {
    static int maxOf(int[] a) {                                    // a라는 이름의 정수 배열의 최댓값을 구하는 메서드를 정의
        int max = a[0];                                            // 배열 a의 첫 번째 요소를 최댓값으로 초기화
        for (int i = 1; i < a.length; i++) {                       // 배열 a의 두 번째 요소부터 마지막 요소까지 반복
            if (a[i] > max) {                                      // 현재 요소의 값이 최댓값보다 크면
                max = a[i];                                        // 최댓값을 현재 요소의 값으로 변경
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        int num = 1 + rand.nextInt(20);                      // 1 ~ 20 사이의 난수를 생성하고 사람 수 저장
        int[] height = new int[num];                                // 사람 수와 같은 크기의 정수 배열을 생성

        System.out.println("사람 수는 " + num + "명입니다.");
        System.out.println("키는 다음과 같습니다.");
        for (int i = 0; i < num; i++) {                             // 배열 height의 요소 반복
            height[i] = 100 + rand.nextInt(90);              // 난수를 생성하고 배열 height의 요소에 저장
            System.out.println("height[" + i + "] : " + height[i]); // 배열 height의 요소 출력
        }
        System.out.println("최댓값 : " + maxOf(height));
    }
}
