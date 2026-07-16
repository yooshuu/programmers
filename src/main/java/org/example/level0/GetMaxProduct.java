package org.example.level0;

public class GetMaxProduct {
    public static void main(String[] args) {
        /*
        정수 배열 numbers가 매개변수로 주어집니다.
        numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
         */

        int[] numbers = {1, 2, -3, 4, -5};
        System.out.println(solution(numbers));
    }

    static int solution(int[] numbers) {

        int max = numbers[0] * numbers[1];

        for(int i=2; i<numbers.length; i++) {
            for(int j=0; j<i; j++) {
                if (numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }
            }
        }

        return max;
    }
}
