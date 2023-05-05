/*
코드업 - 문제집 - 스택 - 1714 : 숫자 거꾸로 출력하기

문제
어떤 수 N이 입력되면 그 수를 거꾸로 출력하는 프로그램을 작성하시오.

입력
입력되는 수 N은 0이상의 정수이다.

출력
입력된 수를 거꾸로 출력한다.

예제 입력
123456

예제 출력
654321
*/
package codeup.문제집.스택;

import java.util.Scanner;

public class N1714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("");

        int length = arr.length;
        for (int i = length - 1; i >= 0 ; i--) { // 끝에서 하나씩 출력
            System.out.print(arr[i]);
        }
    }
}
