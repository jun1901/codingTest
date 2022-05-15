package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem10912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            boolean[] alpha = new boolean[26];
            boolean sw = false;
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                int index = input.charAt(j)-'a';
                alpha[index] = ! alpha[index];
            }
            sb.append("#"+i+" ");
            for (int j = 0; j < alpha.length; j++) {
                if(alpha[j]){
                    sw = true;
                    sb.append((char)(j+'a'));
                }
            }
            if(!sw) sb.append("Good");
            sb.append("\n");
        }
        System.out.println(sb);
    }

/*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        ArrayList<String> list = null;

        for (int i = 1; i <= T ; i++) {
            list = new ArrayList<>();
            String input = br.readLine(),s=null;
            for (int j = 0; j < input.length(); j++) {
                s = input.substring(j,j+1);
                if(!list.isEmpty() && list.contains(s)) list.remove(s);
                else list.add(s);
            }
            sb.append("#"+i+" ");
            if(list.isEmpty()) sb.append("Good");
            else{
                Collections.sort(list);
                list.forEach(sb::append);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
*/
}
