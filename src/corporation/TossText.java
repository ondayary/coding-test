/*
문제명 : 멋쟁이 숫자
숫자로만 이루어진 문자열 s가 있습니다. (0 <=  s.length < 1,000)
아래의 조건을 모두 만족하는 숫자를 '멋쟁이 숫자'라고 합니다.

[조건]
1. 길이가 3인 s의 substring을 10진수로 읽은 숫자이다.
2. 각 자리의 숫자가 모두 같다.

구현사항
문자열s를 입력받아 멋쟁이 숫자를 리턴하는 함수를 만들어주세요.

만약, 멋쟁이 숫자가 여러 개 존재하는 경우에는 가장 큰 수를 리턴합니다.
만약, 가장 큰 멋쟁이 숫자가 000이라면 0을 리턴합니다.
만약, 멋쟁이 숫자가 존재하지 않다면 -1을 리턴합니다.

예시 문제

예시 1
입력: s = “12223”
출력: 222

예시 2
입력: s = “111999333”
출력: 999
설명: 111, 333, 999 3가지가 존재하고 999가 제일 크므로 999를 리턴합니다.

예시 3
입력: s = “123”
출력: -1
*/
package corporation;

import java.util.Scanner;

public class TossText {
    public static int solution(String s) { // 입력 인수 s, 메서드에 전달하는 값
        int biggest = -1; // 가장 큰 숫자를 찾는 문제이기 때문에, 변수 biggest를 가장 작은 숫자인 -1로 초기화함

        for (int i = 0; i < s.length() - 2; i++) { // 문자열 s의 인덱스 0부터 끝에서 두 번째 인덱스까지 반복
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2)) { // 문자열 s의 인덱스 i, i + 1, i + 2의 문자가 모두 같은지 확인
                biggest = Math.max(biggest, Integer.parseInt(s.substring(i, i + 3))); // 문자열 s의 인덱스 i부터 i + 3까지의 문자열을 정수로 변환
                // substring() 메서드는 문자열의 끝 인덱스를 포함하지 않는다. 따라서, substring(i, i + 3)는 문자열 s의 인덱스 i부터 i + 2까지의 문자열을 추출한다.
            }
        }
        return biggest;
    }

    public static void main(String[] args) {
        // 문자열 s를 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("s = ");
        String s = sc.next();

        // TossText 클래스의 solution() 메서드를 호출
        int biggest = TossText.solution(s);

        // 변수 biggest의 값을 출력
        System.out.println(biggest);
    }
}
