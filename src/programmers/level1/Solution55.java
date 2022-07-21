package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution55 { // 직사각형 별찍기 - https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        for(int i = 0; i <b; i++){
            for(int j = 0; j < a; j++) sb.append("*");
            sb.append("\n");
        }
        System.out.print(sb);
    }

}