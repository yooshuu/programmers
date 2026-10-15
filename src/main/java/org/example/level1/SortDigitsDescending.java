package org.example.level1;

public class SortDigitsDescending {
    public static void main(String[] args) {
        /*
        함수 solution은 정수 n을 매개변수로 입력받습니다.
        n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
        예를들어 n이 118372면 873211을 리턴하면 됩니다.
         */

        long n = 118372;
        System.out.println(solution(n));
    }

    static long solution(long n) {

        String str = String.valueOf(n);
        char[] num = str.toCharArray();

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] < num[j + 1]) {
                    char temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        String sortStr = new String(num);
        long answer = Long.parseLong(sortStr);

        return answer;
    }
}
