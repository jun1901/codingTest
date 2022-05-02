package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= 10 ; i++) {
            int[] list = new int[100];
            int index = 0, dump = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens())
                list[index++] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < dump; j++) {
                Arrays.sort(list);
                list[99] -= 1;
                list[0] += 1;
            }
            Arrays.sort(list);
            sb.append("#" + i + " " + (list[99] - list[0]) + "\n");
        }
        System.out.println(sb);
    }
}
