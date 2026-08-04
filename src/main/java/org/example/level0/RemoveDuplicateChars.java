package org.example.level0;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        /*
        문자열 my_string이 매개변수로 주어집니다.
        my_string에서 중복된 문자를 제거하고
        하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
         */

        String my_string = "people";
        System.out.println(solution(my_string));
    }

    static String solution(String my_string) {

        String ans = "";

        for(int i=0; i<my_string.length(); i++) {
            if (!ans.contains(my_string.substring(i, i+1))) {
                ans += my_string.substring(i, i+1);
            }
        }

        return ans;
    }
}
