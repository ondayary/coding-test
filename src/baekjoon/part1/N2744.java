package baekjoon.part1;

import java.util.Scanner;

public class N2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 입력받은 문자열 str에 저장
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // str의 i번째 글자를 ch에 저장
            if('A' <= ch && ch <= 'Z') { // ch가 대문자라면 소문자로 변경
                System.out.print((char)('a' + ch - 'A'));
                // ch - 'A'는 우리가 알아보고자 하는 ch에 들어갈 문자가 'A'에서 얼마만큼
                // 떨어져 있는지를 알아내기 위해서 빼는 것이고
                // 'a'를 더해주는 것은 소문자로 변경하기 위해 그 자리를 더해준 것이고
                // 'a'의 떨어진 거리만큼 더해줘 그 거리의 소문자를 구하는 것이다.
            } else { // ch가 소문자라면 대문자로 변경
                System.out.print((char)('A' + ch - 'a'));
            }
        }
    }
    /**
     * 입력: 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
     * WrongAnswer
     * 출력: 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
     * wRONGaNSWER
     */
}
