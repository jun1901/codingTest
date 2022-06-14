package programmers.level1;

public class Solution26 {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        /*
        int l = s.length()/2;
        System.out.println(l);
        return l != s.length()/2.0 ? s.substring(l,l+1) : s.substring(l-1,l+1);

         */
        int l = s.length();
        return s.substring((l-1)/2,l/2+1);
    }
}

