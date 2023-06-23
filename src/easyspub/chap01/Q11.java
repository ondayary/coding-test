/*
연습 1-11

위쪽과 왼쪽에 곱하는 수가 있는 구구단 곱셈표를 출력하는 프로그램을 작성하세요.
구분선은 수직선(|), 마이너스(-), 플러스(+) 기호를 사용하세요.
*/
package easyspub.chap01;

public class Q11 {
    public static void main(String[] args) {
        System.out.print("   |");
        for (int i = 1; i <= 9; i++) { // 1부터 9까지의 정수 반복
            System.out.printf("%3d", i); // i의 값을 3자리로 출력
        }
        System.out.println("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) { // 1부터 9까지의 정수 반복
            System.out.printf("%2d |", i); // i의 값을 2자리로 출력하고, | 기호 출력
            for (int j = 1; j <= 9; j++) { // 1부터 9까지의 정수 반복
                System.out.printf("%3d", i * j); // i와 j의 값을 곱한 결과를 3자리로 출력
            }
            System.out.println();
        }
    }
}
