package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem13218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        /*
        for (int i = 1; i <= T ; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append("#").append(i).append(" ").append(num/3).append("\n");
        }
        */
        /*
        for (int i = 1; i <= T ; i++)
            sb.append("#").append(i).append(" ").append(Integer.parseInt(br.readLine())/3).append("\n");
        System.out.println(sb);
        */
        for (int i = 1; i <= T ; i++)
            System.out.printf("#%d %d\n",i,Integer.parseInt(br.readLine())/3);
    }
}
