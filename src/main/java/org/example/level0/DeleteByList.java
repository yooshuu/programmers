package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteByList {
    public static void main(String[] args) {
        /*
        정수 배열 arr과 delete_list가 있습니다.
        arr의 원소 중 delete_list의 원소를 모두 삭제하고
        남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
         */

        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        System.out.println(Arrays.toString(solution(arr, delete_list)));
    }

    static int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        for(int i : arr) {
            list.add(i);
        }

        for(int j : delete_list) {
            list.remove(Integer.valueOf(j));
        }

        int[] result = new int[list.size()];

        for(int i=0; i<result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
