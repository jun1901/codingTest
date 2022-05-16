package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class R_Problem10570 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(), rs;
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), result = 0;
            int min = (int)Math.ceil(Math.sqrt(A)), max = (int)Math.sqrt(B);

            for (int j = min; j <= max ; j++) {
                String s = j+"";
                rs = new StringBuffer(s);
                if(s.contentEquals(rs.reverse())){
                    s = (int)Math.pow(j,2)+"";
                    rs = new StringBuffer(s);
                    if(s.contentEquals(rs.reverse())) result++;
                }
            }
            sb.append("#"+i+" "+result+"\n");
            //System.out.printf("#%d %d\n", i, result);

        }
        System.out.println(sb);

    }
}
