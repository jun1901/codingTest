package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class Solution15 { // 폰켓몬 - https://programmers.co.kr/learn/courses/30/lessons/1845?language=java
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i: nums) set.add(i);

        return Math.min(set.size(), nums.length/2);
    }


}
