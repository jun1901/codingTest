package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class R_Problem1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int findNum = Integer.parseInt(br.readLine().split(" ")[1]);
        double[][] total = new double[num][2];

        for (int i = 1; i <= num ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            total[i - 1][0] = Integer.parseInt(st.nextToken()) * 0.35;
            total[i - 1][0] += Integer.parseInt(st.nextToken()) * 0.45;
            total[i - 1][0] += Integer.parseInt(st.nextToken()) * 0.2;
        }


    }
}
