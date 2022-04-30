package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        String Odd = "13579";

        for (int i = 1; i <= T ; i++) {
            String num = br.readLine();
            sb.append("#"+i+" " +(Odd.contains(num.substring(num.length()-1))?"Odd\n":"Even\n"));
            /*if(Odd.contains(num.substring(num.length()-1))) sb.append("Odd\n");
            else sb.append("Even\n");*/
        }
        System.out.println(sb);

    }
}
