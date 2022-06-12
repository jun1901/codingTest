package programmers.level1;

import java.util.Set;
import java.util.TreeSet;

public class Solution20 { // 두 개 뽑아서 더하기 - https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(solution(numbers));
    }

    public static Set<Integer> solution(int[] numbers) {
        //int[] answer=null;
        Set<Integer> set = new TreeSet<>();
        int l = numbers.length;
        for (int i = 0; i < l-1; i++) {
            for (int j = i+1; j < l; j++) {
                System.out.printf("%d - %d       ",i,j);
                set.add(numbers[i]+numbers[j]);
                set.forEach(a -> System.out.printf("%d ",a));
                System.out.println();
            }
        }
        //set.forEach(i -> System.out.printf("%d ",i));
        for (int i: set) {
            System.out.printf("%d ",i);
        }

        return set;
    }

}