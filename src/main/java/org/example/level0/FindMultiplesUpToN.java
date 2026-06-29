package org.example.level0;

import java.util.Arrays;

public class FindMultiplesUpToN {
    public static void main(String[] args) {
        /*
        정수 n과 k가 주어졌을 때,
        1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로
        저장한 배열을 return 하는 solution 함수를 완성해 주세요.
         */

        int n = 10;
        int k = 3;
        System.out.println(Arrays.toString(solution(n, k)));
    }

    static int[] solution(int n, int k) {

        int[] answer = new int[n/k];

        for(int i=0; i<answer.length; i++) {
            answer[i] = k * (i+1);
        }

        return answer;
    }
}
