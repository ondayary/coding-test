/*
백준 - 문제 순위 - 소수 찾기

문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

예제 입력
4
1 3 5 7

예제 출력
3
*/
package baekjoon.problem_ranking;

import java.util.Scanner;

public class N1978 {
    public static void main(String[] args) {
        // 소수 : 1과 자기 자신만을 약수로 갖는 자연수
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            // 소수인 경우 true, 아닌 경우 false
            boolean isPrime = true;

            int num = sc.nextInt();
            if (num == 1) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++; // 소수인 경우 count +1
        }
        System.out.println(count);
    }
}
