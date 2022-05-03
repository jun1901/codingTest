package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= 10 ; i++) {
            int num = Integer.parseInt(br.readLine()), result = 0, min, sub;
            int[] list = new int[num];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num; j++) list[j] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < num; j++) {
                min = 256;
                if(j == 0 && (sub = list[j] - Math.max(list[j+1], list[j+2])) > 0) min = sub;
                else if(j == 1 && (sub = list[j] - Math.max(list[j-1], Math.max(list[j+1], list[j+2]))) > 0) min = sub;
                else if(j == num-2 && (sub = list[j] - Math.max(list[j+1], Math.max(list[j-1], list[j-2]))) > 0) min = sub;
                else if(j == num-1 && (sub = list[j] - Math.max(list[j-1], list[j-2])) > 0) min = sub;
                else if(2 <= j && j <= num -3) min = list[j]-Math.max(list[j+2], Math.max(list[j+1], Math.max(list[j-1], list[j-2])));
//                System.out.printf("j = %d, min = %d\n",j,min == 256 ? 0 : min);
                result += (min == 256 || min < 0) ? 0 : min;
            }
            sb.append("#"+i+" "+result+"\n");
        }
        System.out.println(sb);
    }
}
