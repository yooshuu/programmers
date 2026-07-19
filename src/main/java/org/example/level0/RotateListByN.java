package org.example.level0;

import java.util.Arrays;

public class RotateListByN {
    public static void main(String[] args) {
        /*
        정수 리스트 num_list와 정수 n이 주어질 때,
        num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠
        n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
         */

        int[] num_list = {2, 1, 6};
        int n = 1;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    static int[] solution(int[] num_list, int n) {

        int[] answer = new int[num_list.length];

        for(int i=0; i<answer.length; i++) {
            answer[i] = num_list[(n+i) % answer.length];
        }

        return answer;
    }
}
