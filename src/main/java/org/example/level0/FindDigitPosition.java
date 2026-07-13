package org.example.level0;

public class FindDigitPosition {
    public static void main(String[] args) {
        /*
        정수 num과 k가 매개변수로 주어질 때,
        num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
        없으면 -1을 return 하도록 solution 함수를 완성해보세요.
         */

        int num = 29183;
        int k = 1;
        System.out.println(solution(num, k));
    }

    static int solution(int num, int k) {

        int answer = -1;
        String str = num + "";

        for(int i=0; i<str.length(); i++) {
            if (num%10 == k) {
                answer = str.length()-i;
            }

            num /= 10;
        }

        return answer;
    }
}
