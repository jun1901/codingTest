package programmers.level1;

import java.util.Set;
import java.util.TreeSet;

public class Solution29 { // 나누어 떨어지는 숫자 배열 - https://programmers.co.kr/learn/courses/30/lessons/12910?language=java
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(solution(arr,divisor));
    }

    public static Set<Integer> solution(int[] arr, int divisor){
        Set<Integer> set = new TreeSet<>();
        int l = arr.length;
        for (int i = 0; i < l; i++) if(arr[i] % divisor == 0) set.add(arr[i]);
        if(set.isEmpty()) set.add(-1);

        return set;
    }

}