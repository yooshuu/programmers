package org.example.level0;

public class CalcArrayAverage {
    public static void main(String[] args) {
        /*
        정수 배열 numbers가 매개변수로 주어집니다.
        numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
         */

        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(solution(nums1));
        int[] nums2 = {89,90,91,92,93,94,95,96,97,98,99};
        System.out.println(solution(nums2));
    }

    static double solution(int[] numbers) {
        double answer = 0;
        int hap = 0;

        for(int i=0; i<numbers.length; i++) {
            hap += numbers[i];
        }
        answer = (double)hap / numbers.length;
        return answer;
    }
}
