package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDivisors {
    public static void main(String[] args) {
        /*
        정수 n이 매개변수로 주어질 때,
        n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
         */

        int n1 = 24;
        System.out.println(Arrays.toString(solution(n1)));
        int n2 = 29;
        System.out.println(Arrays.toString(solution(n2)));
    }

    static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if (n%i == 0) {
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}