package org.example.level0;

import java.util.Arrays;

public class GetSortedSuffixes {
    public static void main(String[] args) {
        /*
        어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
        예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
        문자열 my_string이 매개변수로 주어질 때,
        my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
         */

        String my_string = "banana";
        System.out.println(Arrays.toString(solution(my_string)));
    }

    static String[] solution(String my_string) {

        String[] answer = new String[my_string.length()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = my_string.substring(i);
        }

        // 삽입 정렬 : 현재 값(target)을 앞의 정렬된 영역에서 알맞은 위치에 삽입
        for(int i=1; i<answer.length; i++) {

            String target = answer[i]; // 삽입할 문자열 임시 저장
            int j = i - 1; // 정렬된 영역의 마지막 인덱스

            // answer[j]가 target보다 사전 순으로 뒤에 있으면 한 칸 오른쪽으로 밀기
            // comepareTo() > 0 : 앞 문자열이 사전순으로 더 뒤에 있음
            while (j >= 0 && answer[j].compareTo(target) > 0) {
                answer[j + 1] = answer[j];
                j--;
            }

            answer[j+1] = target; // 알맞은 위치에 삽입
        }

        return answer;
    }
}
