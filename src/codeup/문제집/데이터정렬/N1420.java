/*
코드업 - 문제집 - 데이터 정렬 - 1420 : 3등 찾기

문제
민준이는 뒤늦게 정보 과목의 중요성을 깨닫고 학습실에서 공부를 하고 있다.
기본 공부가 너무 안 되어 있어 아주 쉬운 문제부터 어려움을 겪은 민준이는 친구에게 물어보려고 한다.
가장 잘 하는 친구에게 물어보기는 질문의 내용이 너무 부끄러워 n명의 친구들 중 정보 성적이 3번째로 높은 친구에게 묻고자 한다.
친구들의 성적은 모두 다르다.
n명의 친구들의 이름과 정보 성적이 주어졌을 때 성적이 세 번째로 높은 학생의 이름을 출력하시오.

입력기
첫째 줄에 n이 입력된다. ( 3 <= n <= 50 )
둘째 줄 부터 n+1행까지 친구의 이름과 점수가 공백으로 분리되어 입력된다. 이름은 영문

출력
세 번째로 높은 학생의 이름을 출력한다.

예제 입력
5
minsu 78
gunho 64
sumin 84
jiwon 96
woosung 55

예제 출력
minsu
*/
package codeup.문제집.데이터정렬;

import java.util.Scanner;

public class N1420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] score = new int[n];
        String[] names = new String[n];
        int temp = 0;

        for (int i = 0; i < score.length; i++) { // score 배열의 크기보다 작을 때까지 반복문 실행
            name[i] = sc.next(); // 문자열을 읽어 name 배열의 i번째 요소에 저장
            score[i] = sc.nextInt(); // 정수를 읽어 score 배열의 i번째 요소에 저장
            names[i] = name[i] + " " + score[i]; // 이름과 성적을 하나의 문자열로 결합
        }

        for (int i = 0; i < score.length; i++) { // 배열의 모든 요소 순회
            for (int j = 0; j < score.length; j++) { // 바깥 반복문이 순회하고 있는 요소와 배열의 나머지 요소를 비교
                if (score[i] > score[j]) { // 바깥 반복문이 크면 현재 순회하고 있는 요소와 배열의 나머지 요소의 위치를 바꿔 오름차순으로 정렬함
                    temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            if (names[i].contains(String.valueOf(score[2]))) { // name 배열의 i번째 요소가 score 배열의 2번째 요소를 포함하는지
                // String.valueOf() : 숫자, boolean, 문자열, 객체를 문자열로 변환하는 메서드
                // score[2]는 숫자이기 때문에 String.valueOf()를 사용하여 문자열로 변환해야 함
                String[] result = names[i].split(" "); // 공백을 구분자로 사용하여 이름을 두 부분으로 나눔
                System.out.println(result[0]); // 학생의 이름인 첫 번째 부분을 출력함
            }
        }
    }
}
