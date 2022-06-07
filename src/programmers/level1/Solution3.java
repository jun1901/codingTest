package programmers.level1;

public class Solution3 { // 신규아이디 추천 - https://programmers.co.kr/learn/courses/30/lessons/72410?language=java
    public static void main(String[] args) {
        System.out.println(solution("=.="));
    }

    public static String solution(String new_id) {
        int i = 0,l;
        StringBuilder sb = new StringBuilder(new_id.toLowerCase().replaceAll("[^a-z0-9-_.]","").replaceAll("[.]+","."));
        if(sb.charAt(0) == '.') sb.deleteCharAt(0);
        l =sb.length();
        if(l>0 && sb.charAt(l-1) == '.') {
            sb.deleteCharAt(l-1);
            l -= 1;
        }
        if(l == 0) sb.append("aaa");
        else if(l == 1) sb.append(sb).append(sb.charAt(1));
        else if(l == 2) sb.append(sb.charAt(1));
        else if(l > 15){
            sb.delete(15,l);
            if(sb.charAt(14) == '.') sb.deleteCharAt(14);
        }
        return String.valueOf(sb);

        /*
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9-_.]","");
        new_id = new_id.replaceAll("[.]+",".");
        if(new_id.charAt(0) == '.') new_id = new_id.substring(1);
        if(new_id.length() != 0 && new_id.charAt(new_id.length()-1) == '.') new_id = new_id.substring(0,new_id.length()-1);

        if(new_id.length() == 0) new_id = "aaa";
        else if(new_id.length() > 15) {
            new_id = new_id.substring(0,15);
            if(new_id.charAt(14) == '.') new_id = new_id.substring(0,14);
        } else if(new_id.length() == 1) new_id += new_id + new_id;
        else if(new_id.length() == 2) new_id += new_id.charAt(1);
*/

       //return new_id;
    }


}
