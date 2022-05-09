package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            String input = br.readLine();
            sb.append("#"+i+" ");
            for (int j = input.length()-1; j >= 0; j--){
                switch (input.charAt(j)){
                    case 'b' : sb.append('d'); break;
                    case 'd' : sb.append('b'); break;
                    case 'p' : sb.append('q'); break;
                    default  : sb.append('p'); break;
                }
                /*
                switch (input.substring(j,j+1)){
                    case "b" : sb.append("d"); break;
                    case "d" : sb.append("b"); break;
                    case "p" : sb.append("q"); break;
                    default  : sb.append("p"); break;
                }
                */
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }

/*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            Stack<String> stack = new Stack<>();
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) stack.push(input.substring(j,j+1));
            sb.append("#"+i+" ");
            while (!stack.isEmpty()){
                switch (stack.pop()){
                    case "b" : sb.append("d"); break;
                    case "d" : sb.append("b"); break;
                    case "p" : sb.append("q"); break;
                    default  : sb.append("p"); break;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
*/
}
