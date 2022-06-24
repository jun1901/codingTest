package programmers.level1;

import java.util.*;

public class Solution1 { // 신고결과 받기 - https://programmers.co.kr/learn/courses/30/lessons/92334?language=java
    public static void main(String[] args) {
        String[] id_list = {"con", "ryan"}, report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;
        System.out.println(solution(id_list,report,k));
    }

    public static ArrayList<Integer> solution(String[] id_list, String[] report, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>(), result = new LinkedHashMap<>();
        Map<String, Set<String>> map = new HashMap<>();

        for (String s: id_list) result.put(s,0);

        for (String s: report) {
            String[] ss = s.split(" ");
            Set<String> set = map.getOrDefault(ss[1],new HashSet<>());
            set.add(ss[0]);
            map.put(ss[1],set);
            count.put(ss[1], map.get(ss[1]).size());
        }

        Iterator<Map.Entry<String, Integer>> ir = count.entrySet().iterator();
        while (ir.hasNext()){
            Map.Entry<String, Integer> entry = ir.next();
            if(entry.getValue() >= k) {
                Iterator<String> iterator = map.get(entry.getKey()).iterator();
                while (iterator.hasNext()) {
                    String s = iterator.next();
                    result.put(s, result.get(s)+1);
                }
            }
        }

        answer.addAll(result.values());
/*
        Iterator<Map.Entry<String, Integer>> iterator = result.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.printf("%s %d\n",next.getKey(),next.getValue());
        }
*/
        return answer;
    }


}
