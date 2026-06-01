package org.example.level0;

import java.util.Arrays;

public class FindMedianValue {
    public static void main(String[] args) {
        /*
        중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
        예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
        정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
         */

        int[] array = {1,7,10,2,11};
        System.out.println(solution(array));
    }

    static int solution(int[] array) {
        Arrays.sort(array);

        int answer = array[array.length / 2];

        return answer;
    }
}
