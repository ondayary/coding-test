/*
백준 - 단계별로 풀어보기 - 반복문 - A+B-5

문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
입력은 여러 개의 테스트 케이스로 이루어져 있다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
입력의 마지막에는 0 두 개가 들어온다.

예제 입력
1 1
2 3
3 4
9 8
5 2
0 0

예제 출력
2
5
7
17
7
*/

package baekjoon.step;

import java.util.Scanner;

public class N10952 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) { // 무한반복
            int A = in.nextInt();
            int B = in.nextInt();

            if (A == 0 && B == 0){
                in.close();
                break;
            }
            System.out.println(A + B);
        }
    }
}
