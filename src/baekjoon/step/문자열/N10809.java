/*
백준 - 단계별로 풀어보기 - 문자열 - 알파벳 찾기

문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

예제 입력
baekjoon

예제 출력
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
*/
package baekjoon.step.문자열;

import java.util.Scanner;

public class N10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26]; // 문자열 S에 각 문자의 위치를 가리킬 배열
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        String S = sc.nextLine();
        for (int i = 0; i < S.length(); i++) { // 각 문자 검사
            char ch = S.charAt(i); // charAt() 이라는 메서를 사용하여 문자를 추출한 뒤 ch 라는 변수에 저장
            if (arr[ch - 'a'] == -1) { // arr의 원소값이 -1인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }
        for (int var : arr) { // 배열 출력
            System.out.print(var + " ");
        }
    }
}
