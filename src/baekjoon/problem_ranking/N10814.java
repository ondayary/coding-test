/*
백준 - 문제 순위 - 나이순 정렬

문제
온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.

출력
첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.

예제 입력
3
21 Junkyu
21 Dohyun
20 Sunyoung

예제 출력
20 Sunyoung
21 Junkyu
21 Dohyun
*/
package baekjoon.problem_ranking;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class N10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] arr = new String[N][2]; // N개의 행과 2개의 열

        for (int i = 0; i < N; i++) { // N까지 arr배열의 각 행을 순회함
            arr[i][0] = sc.next(); // 나이
            arr[i][1] = sc.next(); // 이름
        }

        Arrays.sort(arr, new Comparator<String[]>() { // arr 배열 정렬, Comparator 인터페이스를 구현하는 객체를 인수로 받음
                                                      // Comparator 인터페이스는 두 개의 String 객체를 비교하는 메서드를 제공함
            @Override // 부모 클래스의 메서드를 재정의 함
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]); // 요소를 정수로 반환 후 차이 반환
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
