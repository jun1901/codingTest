package programmers.level1;

public class Solution21 { // 2016년 - https://programmers.co.kr/learn/courses/30/lessons/12901?language=java
    public static void main(String[] args) {
        int a = 5, b = 24;
        System.out.println(solution(a,b));

    }

    public static String solution(int a, int b) {
        String [] weeks ={"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int [] days = {31, 29, 31,30,31,30,31,31,30,31,30,31};
        int totalDay = b;
        for (int i = 0; i < a - 1; i++) totalDay += days[i];

        return weeks[totalDay%7];
    }

}