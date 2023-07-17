/*
실습 2C-1 배열 복제
*/
package easyspub.chap02;

import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone(); // b는 a의 복제를 참조하도록 초기화됨

        b[3] = 0; // 한 요소에만 0 대입

        System.out.println("a = " + Arrays.toString(a)); // 배열 a의 요소들을 문자열로 변환하여 반환
        System.out.println("b = " + Arrays.toString(b));
    }
}
