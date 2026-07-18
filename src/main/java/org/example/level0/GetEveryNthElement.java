package org.example.level0;

import java.util.Arrays;

public class GetEveryNthElement {
    public static void main(String[] args) {
        /*
        정수 리스트 num_list와 정수 n이 주어질 때,
        num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는
        원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
         */

        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    static int[] solution(int[] num_list, int n) {

        int[] answer = new int[(num_list.length-1)/n + 1];

        for(int i=0; i<answer.length; i++) {
            answer[i] = num_list[i*n];
        }

        return answer;
    }
}
