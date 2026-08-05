package org.example.level0;

public class FindClosestToN {
    public static void main(String[] args) {
        /*
        정수 배열 array와 정수 n이 매개변수로 주어질 때,
        array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
         */

        int[] array = {3, 10, 28};
        int n=20;
        System.out.println(solution(array, n));
    }

    static int solution(int[] array, int n) {

        int answer = array[0];
        int clo = Math.abs(n-array[0]);

        for(int i=1; i<array.length; i++) {
            int num = Math.abs(n-array[i]);

            if (num < clo) {
                clo = num;
                answer = array[i];
            } else if (num == clo) {
                answer = Math.min(answer, array[i]);
            }
        }

        return answer;
    }
}
