/*
백준 - 단계별로 풀어보기 - 2차원 배열 - 색종이

문제
가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다.

출력
첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.

예제 입력
3
3 7
15 7
5 2

예제 출력
260
*/
package baekjoon.step.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;  // 검은 영역의 넓이
        int N = Integer.parseInt(br.readLine()); // 색종이 개수
        boolean[][] arr = new boolean[101][101]; //도화지

        // 색종이를 하나씩 입력받아 도화지에 표시
        for (int i = 0; i < N; i++) {

            // 색종이의 X, Y 좌표를 입력받음
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            // (X,Y)부터 (X + 9, Y + 9)까지의 영역을 하나씩 체크한 후 총 넓이에 더함
            for (int j = X; j < X + 10; j++) {
                for (int k = Y; k < Y + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        total++;
                    }
                }
            }
        }
        System.out.print(total); // 총 넓이 출력
    }
}