package org.example.level0;

public class SumOrProductByLength {
    public static void main(String[] args) {
        /*
        정수가 담긴 리스트 num_list가 주어질 때,
        리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을
        10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
         */

        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        System.out.println(solution(num_list));
    }

    static int solution(int[] num_list) {
        int hap = 0;
        int mul = 1;

        if (num_list.length >= 11) {
            for (int n : num_list) {
                hap += n;
            }
            return hap;
        } else {
            for (int n : num_list) {
                mul += n;
            }
            return mul;
        }
    }
}
