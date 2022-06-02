package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class R_Solution3 { // 신고결과 받기 - https://programmers.co.kr/learn/courses/30/lessons/92334?language=java
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"}, report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list,report,k)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> count = new HashMap<>();
        HashMap<String, ArrayList<String>> list = new HashMap<>();
        ArrayList<String> ss = null;
        for (int i = 0; i < report.length; i++) {
            String[] s = report[i].split(" ");
            if(!count.containsKey(s[1])) count.put(s[1],1);
            else count.put(s[1], count.get(s[1])+1);

            if(!list.containsKey(s[1])) {
                ss = new ArrayList<>();
                ss.add(s[0]);
            } else {
                ss = list.get(s[1]);
                ss.add(s[0]);
            }
            list.put(s[1], ss);
        }

        for (int i = 0; i < count.size(); i++) {
            if(count.get( id_list[i]) >= k){
                ss = list.get(id_list[i]);
                for (int j = 0; j < ss.size(); j++) {
                    for (int l = 0; l < id_list.length; l++) {
                        if(ss.contains(id_list[l])){
                            answer[l]++;
                            break;
                        }
                    }
                }
            }
        }




        return answer;
    }


}
