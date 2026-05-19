package org.example.level0;

import java.util.Arrays;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        /*
        정수가 담긴 리스트 num_list가 주어질 때,
        num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
         */

        int[] num_list = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i=0; i<num_list.length; i++) {
            answer[num_list[i]%2]++;
        }
        return answer;
    }
}