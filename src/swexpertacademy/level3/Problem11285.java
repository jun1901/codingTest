package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11285 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int N = Integer.parseInt(br.readLine()),x,y,p,result=0;
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                System.out.printf("x:%d y:%d r:%f-%f\n",x,y,Math.sqrt(Math.pow(x,2)+Math.pow(y,2)),Math.sqrt(Math.pow(x,2)+Math.pow(y,2))/20);
                //result += Math.max(0,Math.min(10,11-Math.ceil(Math.sqrt(Math.pow(x,2)+Math.pow(y,2))/20)));
                switch (p=(int)(11-Math.ceil(Math.sqrt(Math.pow(x,2)+Math.pow(y,2))/20))){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: result += p;
                    case 0:break;
                    default: result += 10;
                }
            }
            sb.append("#"+i+" "+result+"\n");
        }
        System.out.print(sb);
    }
}
