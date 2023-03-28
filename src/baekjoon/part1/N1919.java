package baekjoon.part1;

import java.util.Scanner;

public class N1919 {
    public static int[] get_alphabet_count(String str) {
        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++)
            count[str.charAt(i) - 'a']++; // 'a'를 빼줘야 인덱스 안에 들어온다.

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // 공백으로 구분된 한 문자열을 받기 위해서는 next를 쓰면 된다.
        String b = sc.next();

        // a와 b의 알파벳 구성을 구할 것이다.
        int[] a_count = get_alphabet_count(a);
        int[] b_count = get_alphabet_count(b);

        int answer = 0;
        for (int i = 0; i < 26; i++) {
            // 차이가 나는 부분들을 더해주면 된다.
            // 단순히 빼게 되면 음수가 나올 수 있기 때문에 구분해준 것이다.
/*
            if(a_count[i] > b_count[i]) // a의 알파벳이 b의 알파벳보다 많은 경우 그 갯수만큼 더해주면 된다.
                answer += a_count[i] - b_count[i];
            else if(b_count[i] > a_count[i])
                answer += b_count[i] - a_count[i];
*/

            // abs : 절대값을 리턴해주는 함수
            answer += Math.abs(a_count[i] - b_count[i]);
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