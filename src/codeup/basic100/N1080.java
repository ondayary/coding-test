package codeup.basic100;

import java.util.Scanner;

public class N1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0; // 문자를 합할 변수 선언
        int i = 0; // 증가할 변수
        while(sum < num) { // 입력받은 정수보다 합이 작을 때까지 반복
            i++;
            sum = sum + i;
           }
        System.out.println(i);
    }
    /**
     * 입력: 정수 1개가 입력된다.
     * 55
     * 출력: 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
     * 입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.
     * 10
     */
}
