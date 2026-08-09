package org.example.level0;

public class CountPatternOccurrence {
    public static void main(String[] args) {
        /*
        문자열 myString과 pat이 주어집니다.
        myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
         */

        String myString = "banana";
        String pat = "ana";
        System.out.println(solution(myString, pat));
    }

    static int solution(String myString, String pat) {
        int cnt = 0;
        int e = myString.length() - pat.length();

        for(int i=0; i<e+1; i++) {
            String ans = myString.substring(i,i+pat.length());
            if (ans.equals(pat)) {
                cnt ++;
            }
        }

        return cnt;
    }
}
