package codeup.basic100;

import java.util.Map;
import java.util.Scanner;

public class N1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시작 값
        int r = sc.nextInt(); // 등비의 값
        int n = sc.nextInt(); // 몇 번째 인지를 나타내는 정수

        // 등비수열 식 : a * r^ * n-1
        long result = 0;
        result = (long) (a * Math.pow(r, n-1));
        System.out.println(result);
    }
    /**
     * 입력: 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
     * 공백을 두고 입력된다.(모두 0 ~ 10)
     * 2 3 7
     * 출력: n번째 수를 출력한다.
     * 1458
     */
}
