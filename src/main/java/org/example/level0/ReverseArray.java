package org.example.level0;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
        num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
        */
        int[] num_list = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(num_list)));

    }


    static int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len];
        for(int i=0; i<len; i++) {
            answer[i] = num_list[len-i-1];
        }
        return answer;
    }
}
