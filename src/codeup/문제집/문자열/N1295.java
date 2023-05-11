/*
코드업 - 문제집 - 문자열 - 1295 : 알파벳 대소문자 변환

문제
주어지는 문장의 대문자를 소문자로, 소문자를 대문자로 변경하는 프로그램을 작성하라.

입력
한 줄의 공백없는 문장이 입력된다.(최대 길이:1000)

출력
대소문자를 서로 변환한 결과를 출력한다.

예제 입력
CodeChallenge2014withMSP

예제 출력
cODEcHALLENGE2014WITHmsp
*/
package codeup.문제집.문자열;

import java.util.Scanner;

public class N1295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((int)chars[i] > 96 && (int)chars[i] < 123) {
                chars[i] -= 32;
            } else if ((int)chars[i] > 64 && (int)chars[i] < 91) {
                chars[i] += 32;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
