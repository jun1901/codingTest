package swexpertacademy.level2;

import java.io.*;
import java.util.*;

public class Problem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {

            sb.append("#"+i+" "+"   "+"\n");
        }
        System.out.print(sb);
    }
}
