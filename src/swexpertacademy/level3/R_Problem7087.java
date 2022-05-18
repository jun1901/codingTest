package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class R_Problem7087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int N = Integer.parseInt(br.readLine()), count = 0;

            int[] list = new int[26];
            for (int j = 0; j < N; j++) {
                list[br.read()-'A']++;
                br.readLine();
            }
            for (int b: list){
                if(b == 0) break;
                count++;
            }
            /*
            boolean[] list = new boolean[26];
            for (int j = 0; j < N; j++) {
                list[br.read()-'A']=true;
                br.readLine();
            }
            for (boolean b: list){
                if(!b) break;
                count++;
            }
            */


            /*
            char f = 'A';
            char[] list = new char[N];
            for (int j = 0; j < N; j++) {
                list[j]=(char)br.read();
                br.readLine();
            }
            Arrays.sort(list);
            for (char c: list) {
                if(c==f){
                    count++;
                    f++;
                }
            }
            */
            sb.append("#"+i+" "+count+"\n");
        }
        System.out.print(sb);
    }
}
