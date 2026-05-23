package org.example.level0;

public class MaxProductOfTwo {
    public static void main(String[] args) {
        /*
        정수 배열 numbers가 매개변수로 주어집니다.
        numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록
        solution 함수를 완성해주세요.
         */
        int[] numbers1 = {1,2,3,4,5};
        System.out.println(solution(numbers1));
        int[] numbers2 = {0,31,24,10,1,9};
        System.out.println(solution(numbers2));
    }

    static int solution(int[] numbers) {
        int max = numbers[0];
        int prev = 0;

        for(int i=1; i<numbers.length; i++) {
            if(max < numbers[i]) {
                prev = max;
                max = numbers[i];
            } else if(prev < numbers[i]) {
                prev = numbers[i];
            }
        }

        return prev*max;
    }
}
