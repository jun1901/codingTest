package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine()), l;

        for (int i = 1; i <= T ; i++) {
            l = br.readLine().length();
            sb.append("#"+i+" ");
            switch (l){
                case 1: sb.append(0);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6: sb.append(l-2);
                    break;
                default: sb.append(5);
                    break;
            }
            /*if(l<2) l = 0;
            else if(l>6) l = 5;
            else l -= 2;*/
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
