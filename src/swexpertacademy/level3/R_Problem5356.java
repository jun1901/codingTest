package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class R_Problem5356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            ArrayList<String> list = new ArrayList<>();
            int l = 0, index = 0;
            for (int j = 0; j < 5; j++) {
                list.add(br.readLine());
                l += list.get(j).length();
            }
            System.out.println(l);
            sb.append("#"+i+" ");
            while(l > 0){
                for (int j = 0; j < 5; j++,l--) {
                    System.out.println(list.get(j).length() + " " + index);
                    if(list.get(j).length()>index) {sb.append(list.get(j).charAt(index));}
                }
                index++;
                //for (int j = 0; j < 5; j++) if(list.get(j).hasMoreTokens()) sb.append(list.get(j).nextToken());
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
