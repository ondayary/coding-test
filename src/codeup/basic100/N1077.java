package codeup.basic100;

import java.util.Scanner;

public class N1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
    /**
     * 입력: 정수 1개가 입력된다.
     * 4
     * 출력: 0부터 그 수까지 줄을 바꿔 한 개씩 출력한다.
     * 0
     * 1
     * 2
     * 3
     * 4
     */
}
