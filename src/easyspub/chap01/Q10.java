/*
연습 1-10
양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고, 1314를 입력하면 '그 수는 4자리입니다.'라고 출력합니다.
*/
package easyspub.chap01;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
        } while (num <= 0); // num값이 0보다 작거나 같을 때 루프 반복

        int digit = 0; // 자릿수 변수 초기화

        while (num > 0) {
            num = num / 10; // num을 10으로 나눔
            digit++; // digit 변수의 값을 1씩 증가
        }
        System.out.println("그 수는 " + digit + "자리입니다.");
    }
}
