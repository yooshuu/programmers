package org.example.level0;

public class IsMultipleOfBoth {
    public static void main(String[] args) {
        /*
        정수 number와 n, m이 주어집니다.
        number가 n의 배수이면서 m의 배수이면 1을
        아니라면 0을 return하도록 solution 함수를 완성해주세요.
         */

        int number = 60;
        int n = 2;
        int m = 3;
        System.out.println(solution(number, n, m));

        int number2 = 55;
        int n2 = 10;
        int m2 = 5;
        System.out.println((solution(number2, n2, m2)));
    }

    static int solution(int number, int n, int m) {

        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
