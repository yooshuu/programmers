package org.example.level0;

public class ReverseSubstring {
    public static void main(String[] args) {
        /*
        문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
        my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
         */

        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        System.out.println(solution(my_string, s, e));
    }

    static String solution(String my_string, int s, int e) {

        String answer = "";
        String[] ans = my_string.split("");

        for(int i=0; i<=(e-s)/2; i++) {
            String temp = ans[s+i];
            ans[s+i] = ans[e-i];
            ans[e-i] = temp;
        }

        for(int i=0; i<ans.length; i++) {
            answer += ans[i];
        }

        return answer;
    }
}
