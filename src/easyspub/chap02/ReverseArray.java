/*
실습 2-5

배열 요소에 값을 읽어 들여 역순으로 정렬
*/
package easyspub.chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; // t 변수는 배열 a의 요소 idx1의 값을 임시로 저장하는데 사용됨
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) { // 배열의 절반까지만 순회하면 역순으로 정렬을 완료할 수 있음(반복 횟수를 절반으로 줄이는 최적화)
            /*
            a.length / 2는 배열의 길이를 2로 나눈 값이다.
            예를 들어, 배열의 길이가 5이면, a.length / 2는 2가 된다. 반복문은 배열의 길이를 2로 나눈 값까지만 순회한다. 즉, 배열의 길이가 5라면, 반복문은 0, 1, 2번 순회한다.
             */
            swap(a, i, a.length - i - 1);
            /*
            위 코드는 배열 a의 i번째 요소와 a.length - i - 1번째 요소의 값을 바꾼다.
            예를 들어, 배열의 길이가 5이고 i가 0이면, a.length - i - 1은 4가 된다. 따라서 swap() 메서드는 배열 a의 0번째 요소와 4번째 요소의 값을 바꾼다.
             */
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수: ");

        int num = sc.nextInt();
        int[] x = new int[num]; // num 크기의 배열을 생성 후 정수를 입력받아 배열 x에 저장

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        reverse(x); // reverse() 메서드를 사용하여 배열 x의 요소를 역순으로 정렬

        System.out.println("x = " + Arrays.toString(x)); // 배열 x의 요소들을 문자열로 변환하여 반환하는 메서드
        /*
        예를 들어, int 타입의 배열 x가 [1, 2, 3, 4, 5]로 초기화되어 있다면, Arrays.toString(x)는 문자열 "[1, 2, 3, 4, 5]"를 반환한다.
        Arrays.toString()은 주로 디버깅이나 출력을 위해 배열의 내용을 확인하는 용도로 사용된다.
         */
    }
}
