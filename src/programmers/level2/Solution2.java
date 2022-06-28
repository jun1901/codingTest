package programmers.level2;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(solution(record));
    }

    public static ArrayList<StringBuffer> solution(String[] record) {
        ArrayList<StringBuffer> list = new ArrayList<>();
        Map<String, String> map = new LinkedHashMap<>();
        int l = record.length;
        for (int i = 0; i < l; i++) {
            String[] s = record[i].split(" ");
            switch (s[0]) {
                case "Enter" : list.add(new StringBuffer(s[1]+"님이 들어왔습니다."));
                case "Change" : map.put(s[1], s[2]); break;
                case "Leave" : list.add(new StringBuffer(s[1]+"님이 나갔습니다.")); break;
            }

        }
        for (StringBuffer s: list) {
            int index = s.indexOf("님");
            s.replace(0,index,map.get(s.substring(0,index)));
        }


        return list;
    }

}