/*
백준 - 단계별로 풀어보기 - 문자열 - OX퀴즈

문제
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

출력
각 테스트 케이스마다 점수를 출력한다.

예제 입력
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX

예제 출력
10
9
7
55
30
*/
package baekjoon.step.문자열;

import java.util.Scanner;

public class N8958 {
    /*
    1. 각 케이스마다 점수를 출력한다.
    2. O 의 연속 개수 만큼 점수를 누적하여 합산하고 X가 나오면 누적값은 0으로 초기화 된다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()]; // 사용자로부터 입력받은 정수값을 배열의 크기로 설정하여 arr 배열 생성

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next(); // 입력받은 문자열을 배열에 저장
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) { // arr 배열의 각 요소에 대해 반복문 실행
            int cnt = 0; // 연속 카운트
            int sum = 0; // 누적 합계

            for (int j = 0; j < arr[i].length(); j++) { // arr[i] 문자열의 각 문자에 대해 반복문 실행

                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else { // 현재 문자가 'O'이 아니라면 cnt를 0으로 초기화
                    cnt = 0;
                }
                sum += cnt; // sum 변수에 cnt의 값을 더함
            }
            System.out.println(sum);
        }
    }
}