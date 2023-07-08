/*
실습 5-2 유클리드 호제법으로 최대공약수를 구함

유클리드 호제법은 두 자연수 a와 b의 최대공약수 g(a, b)를 구하는 알고리즘이다.
유클리드 호제법은 다음과 같이 작동한다.

1. b가 0이면 a를 최대공약수로 출력한다.
2. b가 0이 아니면 a를 b로 나눈 나머지 r을 구한다.
3. 유클리드 호제법을 a와 r에 적용하여 최대공약수를 구한다.
*/
package easyspub.chap05;

import java.util.Scanner;

public class EuclidGCD {
    // 정수 x, y의 최대공약수를 구하여 반환
    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다. ");
        System.out.print("정수를 입력: "); int x = sc.nextInt();
        System.out.print("정수를 입력: "); int y = sc.nextInt();

        System.out.println("최대공약수: " + gcd(x, y));
    }
}
/*
y가 0일 때 x가 되는 이유
위의 코드에서 y가 0이면 gcd(y, x % y)는 gcd(0, x % y)가 된다.
gcd(0, x % y)는 x % y가 0이면 x가 되고, x % y가 0이 아니면 gcd(x % y, 0)가 된다.
gcd(x % y, 0)는 x % y가 0이면 x % y가 되고, x % y가 0이 아니면 gcd(0, x % y)가 된다. 이 과정을 계속 반복하면 결국 x가 나온다.
따라서 y가 0이면 gcd(x, y)는 x가 된다.
 */