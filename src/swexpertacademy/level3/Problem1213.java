package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= 10 ; i++) {
            sb.append("#"+br.readLine()+" ");
            String find = br.readLine(), list = br.readLine();
            int result=0, index=-1;
            while((index=list.indexOf(find,index+1)) != -1) result++;
            sb.append(result+"\n");
        }
        System.out.print(sb);
    }
}
