package codeup.basic100;

import java.util.Scanner;

public class N1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시작값
        int d = sc.nextInt(); // 등차
        int n = sc.nextInt(); // 몇 번째인지를 나타내는 정수

        // 등차수열 식 : a + (n-1) * d
        int result = 0;
        result = a + (n-1) * d;
        System.out.println(result);
    }
    /**
     * 입력: 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가
     * 공백을 두고 입력된다.(모두 0 ~ 100)
     * 1 3 5
     * 출력: n번째 수를 출력한다.
     * 13
     */
}
