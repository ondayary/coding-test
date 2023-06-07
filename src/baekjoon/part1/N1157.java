/*
백준 - 단어 공부

문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

예제 입력
Mississipi

예제 출력
?
*/
package baekjoon.part1;

import java.util.Scanner;

public class N1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                arr[str.charAt(i) - 'A']++;
            }
            else {
                arr[str.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자 출력해야 하므로 65 더함
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }

/*    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z')
                count[ch - 'A']++;
            else count[ch - 'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = getAlphabetCount(str);

        // 최대값 구하기
        int max_count = -1; // 정답이 될 최대값을 저장할거라서 아무런 문제가 없는 값 저장
        // 최대값을 가진 알파벳이 무엇인지 구하기
        int max_alphabet = 0;
        for (int i = 0; i < 26; i++) {
            if(count[i] > max_count) {
                max_count = count[i];
                max_alphabet = i;
            }
        }
        System.out.println((char)'A' + max_alphabet);
    }*/
}
