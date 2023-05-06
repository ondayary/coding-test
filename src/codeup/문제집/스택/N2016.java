/*
코드업 - 문제집 - 스택 - 2016 : 천단위 구분기호

문제
큰 수를 표현할 때 자릿수를 쉽게 구분하기 위해 천단위 구분 기호인 콤마(,)를 사용한다.
어떤 수가 입력되면 천단위 구분 기호를 넣어 그 수를 다시 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 길이 n이 입력된다. (1≤n≤200)
둘째 줄에 길이가 n인 숫자가 입력된다.

출력
천단위 구분기호 콤마를 넣어 출력하시오.

예제 입력
8
12421421

예제 출력
12,421,421
*/
package codeup.문제집.스택;

import java.util.Scanner;

public class N2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String m = sc.next();
        char[] word = new char[m.length()]; // m 의 크기만큼 배열 생성

        int comma = n % 3;// 콤마를 찍어줄 위치
        for (int i = 0; i < n; i++) {
            word[i] = m.charAt(i); // char 배열에 m글자를 1개씩 집어넣기
            if (comma == 0) { // 만약 n % 3 == 0 이라면 첫 콤마 생략
                comma += 3;
            }
            if (i == comma) { // i가 a랑 같다면 a는 3증가, 그리고 콤마 찍음
                comma += 3;
                System.out.print(',');
            }
            System.out.print(word[i]); // 숫자 출력
        }
    }
}
