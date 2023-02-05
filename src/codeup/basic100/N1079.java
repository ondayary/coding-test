package codeup.basic100;

import java.util.Scanner;

public class N1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch; // 문자를 입력받을 변수 선언
        while(true) {
            ch = sc.next().charAt(0); // sc.next로 입력받을시 String 타입이므로 charAt으로 타입 변경해서 추출
            System.out.println(ch);
            if(ch == 'q') {
                break;
            }
        }
    }
    /**
     * 입력: 문자들이 1개씩 계속해서 입력된다.
     * x b k d l q g a c
     * 출력: 'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.
     * x
     * b
     * k
     * d
     * l
     * q
     */
}
