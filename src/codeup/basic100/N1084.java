package codeup.basic100;

import java.io.*;
import java.util.Scanner;

public class N1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] color = br.readLine().split(" ");
        int count2 = 0;

        for(int i = 0; i < Integer.valueOf(color[0]); i++) {
            for (int j = 0; j < Integer.valueOf(color[1]); j++) {
                for (int k = 0; k < Integer.valueOf(color[2]); k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    count2 += 1;
                }
            }
        }
        bw.write(String.valueOf(count2));
        bw.flush();

        /**
         * 시간초과된 코드
         */
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();
        int count1 = 0; // 마지막 개수를 출력할 변수

        for (int i = 0; i < red ; i++) {
            for (int j = 0; j < green; j++) {
                for (int k = 0; k < blue; k++) {
                    System.out.printf("%d %d %d \n", i, j, k);
                    count1 += 1; // 가짓수를 찾을 때마다 1씩 증가
                }
            }
        }
        System.out.println(count1);
    }
    /**
     * 입력: 빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128)가 공백을 사이에 두고 입력된다.
     * 예를 들어, 3 3 3 은 각 색깔 빛에 대해서 그 강약에 따라 0~2까지 3가지의 색이 있음을 의미한다.
     * 2 2 2
     * 출력: 만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345.., abcde.., 가나다라마..)으로
     * 줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.
     * 0 0 0
     * 0 0 1
     * 0 1 0
     * 0 1 1
     * 1 0 0
     * 1 0 1
     * 1 1 0
     * 1 1 1
     * 8
     */
}
