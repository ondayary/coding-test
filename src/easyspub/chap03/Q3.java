/*
연습 3-3
요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고, 일치하는 요솟수를 반환하는 메서드를 작성하세요.
예를 들어 요솟수가 8인 배열 a의 요소가 {1,9,2,9,4,6,7,9} 이고 key가 9일 때 배열 idx에 {1,3,7}을 저장하고 3을 반환합니다.
*/
package easyspub.chap03;

import java.util.Scanner;

public class Q3 {

    // 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 앞쪽부터 순서대로 저장하고 일치하는 요솟수를 반환
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int count = 0; // key와 일치하는 요소의 개수 저장
        for (int i = 0; i < n; i++) {
            if (a[i] == key)
                idx[count++] = i; // 배열 idx의 count번째 요소에 i를 저장하고 count를 1 증가
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수: ");

        int num = sc.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }
        System.out.print("검색 값: ");
        int key = sc.nextInt();

        int count = searchIdx(x, num, key, y); // 함수를 사용하여 검색 결과 저장

        if (count == 0)
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        else
            for (int i = 0; i < count; i++) {
                System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
            }
    }
}