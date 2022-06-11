package programmers.level1;

public class Solution18 { // 3진법 뒤집기 - https://programmers.co.kr/learn/courses/30/lessons/68935?language=java
    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));

    }

    public static int solution(int n) {
        StringBuffer sb = new StringBuffer(Integer.toString(n,3));
        sb.reverse();

        return Integer.parseInt(String.valueOf(sb), 3);
        /*
        StringBuffer sb = new StringBuffer();
        while (n > 0){
            sb.append(n%3);
            n /= 3;
        }

        return Integer.parseInt(String.valueOf(sb), 3);
        */

        /*
        int answer = 0, l;
        StringBuffer sb = new StringBuffer();
        while (n > 0){
            sb.insert(0,n%3);
            n /= 3;
        }
        l = sb.length();
        for (int i = 0; i < l; i++) answer += ((sb.charAt(i)-'0')*Math.pow(3,i));


        //return answer;
        */
    }

}