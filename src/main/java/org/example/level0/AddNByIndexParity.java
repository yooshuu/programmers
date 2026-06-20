package org.example.level0;

import java.util.Arrays;

public class AddNByIndexParity {
    public static void main(String[] args) {
        /*
        정수 배열 arr과 정수 n이 매개변수로 주어집니다.
        arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
        arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을
        return 하는 solution 함수를 작성해 주세요.
         */

        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;
        System.out.println(Arrays.toString(solution(arr, n)));
    }

    static int[] solution(int[] arr, int n) {

        for (int i=arr.length-1; i>=0; i-=2) {
            arr[i] += n;
        }

        return arr;
    }
}
