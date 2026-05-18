package org.example.level0;

public class CalcArrayAverage {
    public static void main(String[] args) {
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
