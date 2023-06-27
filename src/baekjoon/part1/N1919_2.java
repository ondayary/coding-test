package baekjoon.part1;

import java.util.Scanner;

public class N1919_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 이 부분은 두 문자열 a와 b를 입력받는다.
        String a = sc.next();
        String b = sc.next();

        // 이 부분은 각 문자열의 각 문자에 대한 개수를 저장하기 위한 배열을 생성한다.
        int[] countA = new int[26]; // 26개의 요소를 가진 int 배열을 생성하고, countA 변수에 저장
        int[] countB = new int[26];

        // 이 부분은 각 문자열의 각 문자에 대한 개수를 각각 countA와 countB에 저장한다.
        for (int i = 0; i < a.length(); i++) {
            countA[a.charAt(i) - 'a']++; // a의 i번째 문자의 아스키 코드에서 'a'의 아스키 코드를 뺀 값을 countA의 i번째 요소에 더함
        }
        for (int i = 0; i < b.length(); i++) {
            countB[b.charAt(i) - 'a']++;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) { // 26번 반복
            if (countA[i] > countB[i]) // countA의 i번째 요소가 countB의 i번째 요소보다 크면
                ans += countA[i] - countB[i]; // ans 변수에 countA의 i번째 요소 - countB의 i번째 요소의 값을 더함
            else if (countB[i] > countA[i])
                ans += countB[i] - countA[i];
        }
        System.out.println(ans);
    }
}
/*
for (int i = 0; i < a.length(); i++) {
    countA[a.charAt(i) - 'a']++;
}

이 코드는 a 문자열의 길이만큼 반복합니다. 각 반복마다 a 문자열의 i번째 문자를 가져와서 소문자 a를 뺍니다. 그리고 그 결과를 countA 배열의 i번째 인덱스에 1 증가시킵니다.

예를 들어, a 문자열이 "xxyybb"라면, 위의 코드는 다음과 같이 실행됩니다.

i = 0
a.charAt(i) = 'x'
a.charAt(i) - 'a' = 23 // a.charAt(0) - 'a'는 'x'의 아스키 코드인 120 - 97 = 23이 됩니다.
countA[23] = 0 + 1 = 1

i = 1
a.charAt(i) = 'x'
a.charAt(i) - 'a' = 23
countA[23] = 1 + 1 = 2

i = 2
a.charAt(i) = 'y'
a.charAt(i) - 'a' = 25
countA[25] = 0 + 1 = 1

i = 3
a.charAt(i) = 'y'
a.charAt(i) - 'a' = 25
countA[25] = 1 + 1 = 2

i = 4
a.charAt(i) = 'b'
a.charAt(i) - 'a' = 2
countA[2] = 0 + 1 = 1

따라서 countA 배열은 다음과 같이 채워집니다.
[1, 2, 1, 2, 1]
*/