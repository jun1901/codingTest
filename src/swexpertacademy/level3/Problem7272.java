package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem7272 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken(), s2 = st.nextToken();
            int j = 0;
            char[] list = {1, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
            boolean sw = false;
            if(s1.length() == s2.length()){
                do{
                    sw = list[s1.charAt(j)-'A'] == list[s2.charAt(j)-'A'];
                    j++;
                } while (j < s1.length() && sw);

                /*
                for (int j = 0; j < s1.length(); j++) {
                    if( list[s1.charAt(j)-'A'] == list[s2.charAt(j)-'A'] ) sw = true;
                    else {
                        sw = false;
                        break;
                    }
                }
                */
            }
            sb.append("#"+i+" "+(sw?"SAME":"DIFF")+"\n");
        }
        /*
        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken(), s2 = st.nextToken(), one="ADOPQR", zero="CEFGHIJKLMNSTUVWXYZ";
            boolean sw = false;
            if(s1.length() == s2.length()){
                for (int j = 0; j < s1.length(); j++) {
                    String c1 = s1.substring(j,j+1), c2 = s2.substring(j,j+1);
                    if( (one.contains(c1) && one.contains(c2)) || ("B".equals(c1) && "B".equals(c2)) || (zero.contains(c1) && zero.contains(c2)) ) sw = true;
                    else {
                        sw = false;
                        break;
                    }
                }
            }
            sb.append("#"+i+" "+(sw?"SAME":"DIFF")+"\n");
        }
        */
        System.out.print(sb);
    }
}
