/*
백준 - 단계별로 풀어보기 - 반복문 - 영수증

문제
준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
영수증에 적힌,
- 구매한 각 물건의 가격과 개수
- 구매한 물건들의 총 금액
을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

입력
첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.

출력
구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.

예제 입력
260000
4
20000 5
30000 2
10000 6
5000 8

예제 출력
Yes
*/

package baekjoon.step.반복문;

import java.util.Scanner;

public class N25304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt(); // 영수증에 적힌 총 금액
        int N = in.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
        int total = 0; // 구매한 물건들의 총 금액

        for (int i = 1; i <= N ; i++) {
            int a = in.nextInt(); // 가격
            int b = in.nextInt(); // 개수
            total = total + (a * b);
        }
        if (total == X) System.out.println("Yes");
        else System.out.println("No");
    }
}
