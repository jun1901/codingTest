package programmers.level1;

public class Solution37 { // 수박수박수박수박수박수? - https://programmers.co.kr/learn/courses/30/lessons/12922?language=java
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }

    public static StringBuffer solution(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) sb.append(i%2 == 0 ? "수" : "박");
        return sb;
    }

}