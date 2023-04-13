/*
백준 - 단계별로 풀어보기 - 반복문 - A+B-4

문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.

예제 입력
1 1
2 3
3 4
9 8
5 2

예제 출력
2
5
7
17
7
*/

package baekjoon.step.반복문;

import java.util.Scanner;

public class N10951 {
    public static void main(String[] args) {
        // 주의할 점
        // 1. 두 정소는 공백으로 나뉘어 구분된다.
        // 2. 입력의 종료는 더이상 읽을 수 있는 데이터(EOF)가 없을 때 종료한다.
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(A + B);
        }
        in.close();
    }
}

/*
EOF(End of File)란?
데이터가 더이상 존재하지 않을 때, 파일의 끝
입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료하라는 것

hasNextInt()란?
입력값이 정수일 경우 true를 반환하며 정수가 아닐 경우 바로 예외를 던지며
더이상의 입력을 받지 않고 hasNextInt()에서 false를 반환하면서 반복문이 종료됨
*/
