package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

public class Problem3975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            //double a = Double.parseDouble(st.nextToken())/Integer.parseInt(st.nextToken()), b = Double.parseDouble(st.nextToken())/Integer.parseInt(st.nextToken());
            //double a = Double.parseDouble(st.nextToken())/Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken())/Double.parseDouble(st.nextToken());
            //sb.append("#"+i+" "+(a>b?"ALICE":a<b?"BOB":"DRAW")+"\n");
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()),
                c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken()),
                A = a*d, B = b*c;
            sb.append("#"+i+" "+(A>B?"ALICE":A<B?"BOB":"DRAW")+"\n");

        }
        System.out.print(sb);
    }
}
