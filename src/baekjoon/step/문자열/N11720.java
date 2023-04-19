/*
백준 - 단계별로 풀어보기 - 문자열 - 숫자의 합

문제
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

출력
입력으로 주어진 숫자 N개의 합을 출력한다.

예제 입력
25
7000000000000000000000000

예제 출력
7
*/
package baekjoon.step.문자열;

import java.util.Scanner;

public class N11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next(); // 공백 없이 입력받기

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + str.charAt(i) - '0';
            // 각 숫자의 아스키코드는 0을 의미하는 48을 빼주면 자신의 수를 가지게 됨
        }
        System.out.println(sum);
        sc.close();
    }
}
/*
아스키 코드의 값이 반환되기 때문에 '0' 또는 48을 빼줘야 한다.
예를 들어 5의 아스키 코드는 53이니 5의 값을 얻으려면 48을 빼야 하고, 48은 0의 아스키 코드 값이니 -'0'과 같이 표현할 수 있는 것이다.
*/