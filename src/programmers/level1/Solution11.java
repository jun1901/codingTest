package programmers.level1;

import java.util.HashMap;

public class Solution11 { // 완주하지 못한 선수 - https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"}, completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant,completion));
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s: participant)  hm.put(s,hm.getOrDefault(s,0) + 1);
        for (String s: completion)  hm.put(s,hm.get(s) - 1);

        for (String key: hm.keySet()) if(hm.get(key) > 0) return key;

        /*
        StringBuffer sb = new StringBuffer();
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++)
            if(!participant[i].equals(completion[i])){
                sb.append(participant[i]);
                break;
            }
        if(sb.length()==0) sb.append(participant[participant.length - 1]);
*/


        return "";
    }

}
