package baekjoon.step.조건문;

import java.util.Scanner;

public class N1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
    /**
     * 입력: 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
     * 10 2
     * 출력: 첫째 줄에 다음 세 가지 중 하나를 출력한다.
     * A가 B보다 큰 경우에는 '>'를 출력한다.
     * A가 B보다 작은 경우에는 '<'를 출력한다.
     * A와 B가 같은 경우에는 '=='를 출력한다.
     * >
     */
}
