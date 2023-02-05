package codeup.basic100;

import java.util.Scanner;

public class N1078 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i < num; i++) { // 1시작
            if(i % 2 == 0) { // 짝수라면
                sum = sum + i;
            }
        }
        System.out.println(sum); // 출력 적어주기
    }
    /**
     * 입력: 정수 1개가 입력된다.(0 ~ 100)
     * 5
     * 출력: 1부터 입력된 수까지 짝수의 합을 출력한다.
     * 6
     */
}

