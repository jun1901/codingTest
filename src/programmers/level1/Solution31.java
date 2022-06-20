package programmers.level1;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution31 { // 문자열 내 마음대로 정렬하기 - https://programmers.co.kr/learn/courses/30/lessons/12915?language=java
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(solution(strings, n)));
    }

    public static String[] solution(String[] strings, int n) {
        int l = strings.length, index=0;
        String [] strArr = new String [l];
        Map<Character, TreeSet<String>> map = new TreeMap<>();
        char c;
        for (int i = 0; i < l; i++) {
            c = strings[i].charAt(n);
            if(!map.containsKey(c)) map.put(c,new TreeSet<>());
            map.get(c).add(strings[i]);
        }
        for (Map.Entry<Character, TreeSet<String>> entries : map.entrySet()) {
            for (String s: entries.getValue()) strArr[index++] = s;
        }

        return strArr;
    }

}