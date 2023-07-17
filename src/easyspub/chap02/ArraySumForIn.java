/*
실습 2C-2 배열의 모든 요소의 합을 구하여 출력(확장 for문)
*/
package easyspub.chap02;

public class ArraySumForIn {
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        double sum = 0;
        for (double i : a) { // (:) '~의 안에 있는', in 이라고 읽음
            // 배열 a의 처음부터 끝까지 모든 요소를 한 개씩 스캔한다. 루프 본문에서는 현재 선택한 요소를 i라고 표현한다.
            sum += i;
        }
        System.out.println("모든 요소의 합: " + sum);
    }
}
