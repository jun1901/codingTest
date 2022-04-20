package swexpertacademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                int outNum = Integer.parseInt(st.nextToken());
                if(outNum % 2 == 1) result += outNum;
            }
            System.out.printf("#%d %d\n",i,result);

        }


    }
}
