package programmers.level1;

public class Solution51 { // 하샤드 수 - https://programmers.co.kr/learn/courses/30/lessons/12947?language=java
    public static void main(String[] args) {
        int x = 11;
        System.out.println(solution(x));
    }

    public static boolean solution(int x) {
        int sum = 0,X=x;
        while (X > 0){
            sum += X % 10;
            X /= 10;
        }
        return x % sum == 0;
    }

}