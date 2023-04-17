/*
백준 - 단계별로 풀어보기 - 문자열 - 단어 길이 재기

문제
알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

출력
첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.

예제 입력
pulljima

예제 출력
8
*/
package baekjoon.step.문자열;

import java.util.Scanner;

public class N2743 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String alphabet = in.next();
        System.out.println(alphabet.length());
    }
}
