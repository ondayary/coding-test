/*
코드업 - 문제집 - 1차원 배열 - 1407 : 문자열 출력하기 1

문제
길이(글자수)가 100이하인 문자열을 입력받아 공백을 제거하고 출력하시오.

입력
문자열이 입력된다.(글자 수는 100글자 이하이고, 알파벳 대소문자와 공백 문자만 입력된다.)

출력
공백을 제거한 후 출력한다.

예제 입력
abC Def gh

예제 출력
abCDefgh
*/
package codeup.문제집.일차원배열;

import java.util.Scanner;

public class N1407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                System.out.print(str.charAt(i));
            }
        }
    }
}
