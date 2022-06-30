package programmers.level2;

public class Solution6 { // 124 나라의 숫자 - https://programmers.co.kr/learn/courses/30/lessons/12899?language=java
    public static void main(String[] args) {
        int n = 9;
        System.out.println(solution(n));
    }

    public static StringBuffer solution(int n) {
        StringBuffer answer = new StringBuffer();
        int[] s = {4, 1, 2};
        while (n > 0){
            answer.insert(0,s[n%3]);
            n = (n%3 == 0 ? n - 3 : n) / 3;
        }

        return answer;
    }

}