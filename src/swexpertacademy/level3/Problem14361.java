package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem14361 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine()),k;

        for (int i = 1; i <= T ; i++) {
            long num = Long.parseLong(br.readLine());
            String[] s1 = (num+"").split(""), s2=null;
            k = 2;
            boolean sw = false;
            Arrays.sort(s1);
            while (s1.length== (s2 = ((num*k++)+"").split("")).length){
                Arrays.sort(s2);
                if(Arrays.equals(s1,s2)){
                    sw = true;
                    break;
                }
            }

            sb.append("#"+i+" "+(sw?"possible":"impossible")+"\n");
        }
/*
        for (int i = 1; i <= T ; i++) {
            long num = Long.parseLong(br.readLine());
            String[] s1 = (num+"").split(""), s2=null;
            int k = 2;
            boolean sw = false;
            Arrays.sort(s1);
            while (s1.length== (s2 = ((num*k++)+"").split("")).length){
                Arrays.sort(s2);
                if(Arrays.equals(s1,s2)){
                    sw = true;
                    break;
                }
            }

            sb.append("#"+i+" "+(sw?"possible":"impossible")+"\n");
        }
*/
/*
        for (int i = 1; i <= T ; i++) {
            String s = br.readLine();
            String[] s1 = s.split(""), s2=null;
            long num = Long.parseLong(s);
            int k = 2;
            boolean sw = false;
            Arrays.sort(s1);
            while (s1.length== (s2 = ((num*k++)+"").split("")).length){
                Arrays.sort(s2);
                if(Arrays.equals(s1,s2)){
                    sw = true;
                    break;
                }
            }

            sb.append("#"+i+" "+(sw?"possible":"impossible")+"\n");
        }
*/

        System.out.print(sb);
    }
}
