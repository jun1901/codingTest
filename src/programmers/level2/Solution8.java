package programmers.level2;

import java.util.*;

public class Solution8 { // 더 맵게 - https://programmers.co.kr/learn/courses/30/lessons/42626?language=java
    public static void main(String[] args) {
        int[] scoville = {1,1,1,1};
        int K = 4;
        System.out.println(solution(scoville,K));
    }

    public static long solution(int[] scoville, int K) {
        long answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num: scoville) queue.offer(num);
        while(queue.size() > 1 && queue.peek() < K){
            //System.out.println(queue);
            queue.offer(queue.poll() + queue.poll() * 2);
            answer++;
        }

        return (queue.size() == 1 && queue.peek() < K)? -1 : answer;
    }

}