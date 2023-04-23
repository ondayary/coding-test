/*
코드업 - 문제 - 1091 : [기초-종합] 수 나열하기3

문제
어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.

예를 들어
1 -1 3 -5 11 -21 43 ... 은
1부터 시작해 이전에 만든 수에 -2를 곱한 다음 1을 더해 다음 수를 만든 수열이다.

이런 이상한 수열을 알게 된 영일이는 또 궁금해졌다.
"그럼.... 13번째 나오는 수는 뭘까?"
영일이는 물론 수학을 아주 잘하지만 이런 문제는 본 적이 거의 없었다...
그래서 프로그램을 만들어 더 큰 수도 자동으로 계산하고 싶어졌다.

시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때,
n번째 수를 출력하는 프로그램을 만들어보자.

입력
시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가
공백을 두고 입력된다.(a, m, d는 -50 ~ +50, n은 10이하의 자연수)

출력
n번째 수를 출력한다.

예제 입력
1 -2 1 8

예제 출력
-85
*/
package codeup.basic100;

import java.util.Scanner;

public class N1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시작 값
        int m = sc.nextInt(); // 곱할 값
        int d = sc.nextInt(); // 더할 값
        int n = sc.nextInt(); // 몇 번째 인지 나타내는 정수

        long result = a;
        for (int i = 1; i < n; i++) {
            result = result * m + d;
        }
        System.out.println(result);
    }
}
