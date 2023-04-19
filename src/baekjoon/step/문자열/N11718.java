/*
백준 - 단계별로 풀어보기 - 문자열 - 그대로 출력하기

문제
입력 받은 대로 출력하는 프로그램을 작성하시오.

입력
입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.

출력
입력받은 그대로 출력한다.

예제 입력
Hello
Baekjoon
Online Judge

예제 출력
Hello
Baekjoon
Online Judge
*/
package baekjoon.step.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}
/*
Scanner: hasNext() 함수를 이용하여 다음 입력 값이 있는지 확인하고 출력하면 된다.
BufferedReader: 입력이 null일 때까지 while문을 반복하여 출력하면 된다.
*/