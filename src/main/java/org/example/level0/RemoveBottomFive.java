package org.example.level0;

import java.util.Arrays;

public class RemoveBottomFive {
    public static void main(String[] args) {
        /*
        정수로 이루어진 리스트 num_list가 주어집니다.
        num_list에서 가장 작은 5개의 수를 제외한 수들을
        오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
         */

        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    static int[] solution(int[] num_list) {

        int[] answer = new int[num_list.length-5];

        Arrays.sort(num_list);

        for (int i=0; i<answer.length; i++) {
            answer[i] = num_list[5+i];
        }

        return answer;
    }
}
