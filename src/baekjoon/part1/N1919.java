package baekjoon.part1;

import java.util.Scanner;

public class N1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // 공백으로 구분된 한 문자열을 받기 위해서는 next를 쓰면 된다.
        String b = sc.next();

        // a와 b의 알파벳 구성을 구할 것이다.
        int[] a_count = new int[26];
        int[] b_count = new int[26];

        for(int i = 0; i < a.length(); i++)
            a_count[a.charAt(i) - 'a']++; // 'a'를 빼줘야 인덱스 안에 들어온다.
        for(int i = 0; i < b.length(); i++)
            b_count[b.charAt(i) - 'a']++;


        int answer = 0;
        for (int i = 0; i < 26; i++) {
            // 차이가 나는 부분들을 더해주면 된다.
            if(a_count[i] > b_count[i]) // a의 알파벳이 b의 알파벳보다 많은 경우 그 갯수만큼 더해주면 된다.
                answer += a_count[i] - b_count[i];
            else if(b_count[i] > a_count[i])
                answer += b_count[i] - a_count[i];
        }
        System.out.println(answer);
    }
    /**
     * 공통된 것이 아니면 전부 제거하면 된다. -> count에 숫자 증가
     * 입력: 첫째 줄과 둘째 줄에 영어 단어가 소문자로 주어진다. 각각의 길이는 1,000자를 넘지 않으며, 적어도 한 글자로 이루어진 단어가 주어진다.
     * aabbcc
     * xxyybb
     * 출력: 첫째 줄에 답을 출력한다.
     * 8
     */
}
