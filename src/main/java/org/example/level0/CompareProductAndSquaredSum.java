package org.example.level0;

public class CompareProductAndSquaredSum {
    public static void main(String[] args) {
        /*
        정수가 담긴 리스트 num_list가 주어질 때,
        모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을
        크면 0을 return하도록 solution 함수를 완성해주세요
         */

        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));
    }

    static int solution(int[] num_list) {
        int hap = 0;
        int mul = 1;

        for (int num : num_list) {
            hap += num;
            mul *= num;
        }

        if (hap*hap > mul) {
            return 1;
        } else {
            return 0;
        }

    }
}
