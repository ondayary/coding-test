package codeup.basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N1085 {
    public static void main(String[] args) throws IOException {
        /**
         * BufferedReader 사용
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 문자열은 띄어쓰기 기준으로 나눠지게 됩니다.

        double hh = Integer.parseInt(st.nextToken());
        double bb = Integer.parseInt(st.nextToken());
        double cc = Integer.parseInt(st.nextToken());
        double ss = Integer.parseInt(st.nextToken());

        // 단위: 1byte=8bit, 1KB=1024byte, 1MB=1024KB
        double save = (hh * bb * cc * ss) / 8 / 1024 / 1024;
        System.out.printf("%.1f MB", save);

        /**
         * Scanner 사용
         */
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt(); // 1초 동안 마이크로 소리강약을 체크하는 수
        double b = sc.nextInt(); // 한 번 체크한 결과를 저장하는 비트
        double c = sc.nextInt(); // 좌우 등 소리를 저장할 트랙 개수인 채널
        double s = sc.nextInt(); // 녹음할 시간

        double result = (h * b * c * s) / 8 / 1024 / 1024;
        System.out.printf("%.1f MB", result);
    }
    /**
     * 입력: h, b, c, s 가 공백을 두고 입력된다.
     * h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.
     * 44100 16 2 10
     * 출력: 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
     * 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.
     * 1.7 MB
     */
}
