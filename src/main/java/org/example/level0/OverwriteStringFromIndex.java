package org.example.level0;

public class OverwriteStringFromIndex {
    public static void main(String[] args) {
        /*
        문자열 my_string, overwrite_string과 정수 s가 주어집니다.
        문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
        문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
         */

        String my_string = "He11oWor1d";
        String overwrtie_string = "lloWorl";
        int s = 2;
        System.out.println(solution(my_string, overwrtie_string, s));
    }

    static String solution(String my_string, String overwrite_string, int s) {

        String before = my_string.substring(0, s);
        String after = my_string.substring(s+overwrite_string.length());

        return before + overwrite_string + after;
    }
}
