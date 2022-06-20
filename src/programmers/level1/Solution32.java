package programmers.level1;

public class Solution32 { // 문자열 내 p와 y의 개수 - https://programmers.co.kr/learn/courses/30/lessons/12916?language=java
    public static void main(String[] args) {
        String s = "pyY";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        /*
        s = s.toUpperCase().replaceAll("[^PY]","");
        int count = 0, l = s.length();
        if(l == 0) return true;
        for (int i = 0; i < l; i++) if(s.charAt(i) == 'P') count++;

        return count == l-count;
         */
        /*
        int p = 0, y = 0, l = s.length();
        for (int i = 0; i < l; i++) {
            switch (s.charAt(i)){
                case 'p': case 'P': p++; break;
                case 'y': case 'Y': y++; break;
            }
        }
        return p-y == 0;
         */
        int count = 0;
        for (String c: s.split("")) {
            switch (c){
                case "p": case "P": count++; break;
                case "y": case "Y": count--; break;
            }
        }
        return count == 0;
    }

}