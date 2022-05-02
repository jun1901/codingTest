package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            HashMap<Integer, Integer> count = new HashMap<>();
            int max = 0,result =0;
            sb.append("#"+br.readLine()+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                int num = Integer.parseInt(st.nextToken());
                count.put(num, count.containsKey(num) ? count.get(num) + 1 : 1);
            }
            Iterator<Map.Entry<Integer, Integer>> ir = count.entrySet().iterator();
            while (ir.hasNext()){
                Map.Entry<Integer, Integer> entry = ir.next();
                if(max < entry.getValue()){
                    max = entry.getValue();
                    result = entry.getKey();
                } else if(max == entry.getValue() && result < entry.getKey()){
                    result = entry.getKey();
                }
            }
            sb.append(result+"\n");
        }
        System.out.println(sb);

    }
}
