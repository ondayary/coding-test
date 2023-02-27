package codeup.basic100;

import java.util.Scanner;

public class N1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i % 3 == 0) continue;
            System.out.print(i + " ");
        }
    }
    /**
     * 입력: 정수 1개를 입력받는다.(1 ~ 100)
     * 10
     * 출력: 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되
     * 3의 배수는 출력하지 않는다.
     * 1 2 4 5 7 8 10
     */
}
