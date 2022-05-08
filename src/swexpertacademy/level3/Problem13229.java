package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem13229 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine()), sub;
        for (int i = 1; i <= T ; i++) {
            sub=0;
            switch (br.readLine()){
                case "MON" : sub++;
                case "TUE" : sub++;
                case "WED" : sub++;
                case "THU" : sub++;
                case "FRI" : sub++;
                case "SAT" : sub++; break;
                default: sub = 7; break;
            }
            sb.append("#"+i+" "+sub+"\n");
        }
        System.out.println(sb);
    }

/*
    public class Problem13229 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        ArrayList<String> days =  new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));

        for (int i = 1; i <= T ; i++) {
            int index = days.indexOf(br.readLine());
            sb.append("#"+i+" "+(index != 6 ? 6-index : 7)+"\n");
        }
        System.out.println(sb);
    }

*/
}
