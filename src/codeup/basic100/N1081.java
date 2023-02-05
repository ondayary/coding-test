package codeup.basic100;

import java.util.Scanner;

public class N1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
    /**
     * 입력: 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
     * 단, n, m은 10이하의 자연수
     * 2 3
     * 출력: 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
     * 첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.
     * 1 1
     * 1 2
     * 1 3
     * 2 1
     * 2 2
     * 2 3
     */
}
