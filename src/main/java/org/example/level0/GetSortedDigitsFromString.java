package org.example.level0;

import java.util.Arrays;

public class GetSortedDigitsFromString {
    public static void main(String[] args) {
        /*
        문자열 my_string이 매개변수로 주어질 때,
        my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
         */

        String my_string = "hi12392";
        System.out.println(Arrays.toString(solution(my_string)));
    }

    static int[] solution(String my_string) {

        my_string = my_string.replaceAll("[a-zA-Z]","");

        String[] nums = my_string.split("");

        int[] answer = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            answer[i] = Integer.parseInt(nums[i]);
        }

        for(int i=0; i<answer.length-1; i++) {
            for(int j=0; j<answer.length-1-i; j++) {
                if (answer[j] > answer[j+1]) {
                    int temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }

        return answer;
    }
}
