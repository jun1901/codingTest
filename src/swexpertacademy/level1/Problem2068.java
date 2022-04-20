package swexpertacademy.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem2068 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /*
        ArrayList<Stack<Integer>> list = new ArrayList<>();

        int num = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < num; i++) {
            Stack<Integer> max = new Stack<>();
            String[] split = bufferedReader.readLine().split(" ");
            for (String s: split) {
                int inputNum = Integer.parseInt(s);
                if(!max.isEmpty()){
                    if(max.peek() < inputNum) max.push(inputNum);
                } else
                    max.push(inputNum);
            }
            list.add(max);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("#%d %d\n",i+1,list.get(i).peek());
        }
        */
        /*
        int num = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < num; i++) {
            String[] split = bufferedReader.readLine().split(" ");
            int max = 0;
            for (String s: split) {
                int inputNum = Integer.parseInt(s);
                if(max < inputNum) max = inputNum;
            }
            System.out.printf("#%d %d\n", i + 1, max);
        }
        */
        StringBuilder sb=new StringBuilder();
        int num = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int max = 0;
            while (st.hasMoreTokens()){
                int inputNum = Integer.parseInt(st.nextToken());
                if(max < inputNum) max = inputNum;
            }
            sb.append("#" + (i + 1) + " " + max + "\n");
        }
        System.out.println(sb);

    }
}
