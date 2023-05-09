/*
코드업 - 문제집 - 1차원 배열 - 1410 : 올바른 괄호 1 (괄호 개수 세기)

문제
프로그래밍을 할 때 가장 중요한 것 중 하나가 괄호의 개수를 맞추는 것이다.
즉, 여는 괄호가 있으면 항상 닫는 괄호가 있고, 닫는 괄호가 있으면 여는 괄호도 있어야 한다.
올바른 괄호를 확인하기 위해 가장 기본적인 방법 중 하나는 여는 괄호와 닫는 괄호의 개수를 세는 것이다.
소괄호로 이루어진 문자열을 주어지면 괄호의 개수를 출력하는 프로그램을 작성하시오.

입력
괄호로 이루어진 문자열이 입력된다. (길이 100,000 이하)

출력
여는 괄호의 개수와 닫힌 괄호의 개수를 출력한다.

예제 입력
((())()(()))

예제 출력
6 6
*/
package codeup.문제집.일차원배열;

import java.util.Scanner;

public class N1410 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = 0;
        int right = 0;
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') left++;
            else if (str.charAt(i) == ')') right++;
        }
        System.out.println(left + " " + right);
    }
}
