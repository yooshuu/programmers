package org.example.level0;

public class CalcBinomial {
    public static void main(String[] args) {
        /*
        문자열 binomial이 매개변수로 주어집니다.
        binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다.
        주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
         */

        String binomial = "43 + 12";
        System.out.println(solution(binomial));
    }

    static int solution(String binomial) {
        int answer = 0;

        String parts[] = binomial.split(" ");
        int n1 = Integer.parseInt(parts[0]);
        int n2 = Integer.parseInt(parts[2]);

        switch (parts[1]) {
            case "+" :
                answer = n1 + n2;
                break;
            case "-" :
                answer = n1 - n2;
                break;
            case "*" :
                answer = n1 * n2;
                break;
        }

        return answer;
    }
}
