package programmers.level1;

public class Solution24 { // 부족한 금액 계산하기 - https://programmers.co.kr/learn/courses/30/lessons/82612?language=java
    public static void main(String[] args) {
        int price = 3, money = 20, count = 5;
        System.out.println(solution(price,money,count));
    }

    public static long solution(int price, int money, int count) {
        long answer = (int)((1+count)*(count/2.0)*price);
        return answer > money ? answer-money : 0 ;
    }

}