package programmers.level1;

public class Solution45 {
    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n));
    }
    public  static long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        if(sqrt != Math.ceil(sqrt)) answer = -1;
        else answer = (long)Math.pow(sqrt+1,2);

        return answer;
    }

}