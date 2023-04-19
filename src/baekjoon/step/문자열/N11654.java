/*
백준 - 단계별로 풀어보기 - 문자열 - 아스키 코드

문제
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

입력
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

출력
입력으로 주어진 글자의 아스키 코드 값을 출력한다.

예제 입력
A

예제 출력
65
*/
package baekjoon.step.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // string으로 입력 받기
        char ch = input.charAt(0); // 입력 받은 글자를 char형으로 변환
        System.out.print((int)ch); // char형 -> int형 변환
    }
}
