package org.example.level0;

public class FindFirstNegativeIndex {
    public static void main(String[] args) {
        /*
        정수 리스트 num_list가 주어질 때,
        첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요.
        음수가 없다면 -1을 return합니다.
         */

        int[] num_list = {12,4,15,46,38,-2,15};
        System.out.println(solution(num_list));
        int[] num_list2 = {13,22,53,24,15,6};
        System.out.println(solution(num_list2));
    }

    static int solution(int[] num_list) {
        int answer = 0;

        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}
