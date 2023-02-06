package codeup.basic100;

import java.util.Scanner;

public class N1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(16); // 16진법으로 받아오는 방법
        for (int i = 1; i < 16; i++) {
            System.out.printf("%X * %X = %X \n", num, i, num * i);
        }
    }
    /**
     * 입력: 16진수로 한 자리 수가 입력된다. 단, A ~ F 까지만 입력된다.
     * B
     * 출력: 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력한다.
     * 계산 결과도 16진수로 출력해야 한다.
     * B*1=B
     * B*2=16
     * B*3=21
     * B*4=2C
     * B*5=37
     * B*6=42
     * B*7=4D
     * B*8=58
     * B*9=63
     * B*A=6E
     * B*B=79
     * B*C=84
     * B*D=8F
     * B*E=9A
     * B*F=A5
     */
}
