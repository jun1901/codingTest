package programmers.level1;

public class Solution27 { // 다트게임 - https://programmers.co.kr/learn/courses/30/lessons/17682?language=java
    public static void main(String[] args) {
        System.out.println(solution("1D2S#10S"));

    }
    public static int solution(String dartResult) {
        int index = -1;
        int[] result = new int[3];
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            switch (c) {
                case 'D' : result[index] = (int) Math.pow(result[index], 2); break;
                case 'T' : result[index] = (int) Math.pow(result[index], 3); break;
                case '#' : result[index] *= -1; break;
                case '*' : result[index] *= 2;  if(index != 0) result[index-1] *= 2;
                case 'S' : break;
                default: if(c == '1' && dartResult.charAt(i+1) == '0') {
                            result[++index] = 10;
                            i++;
                         } else result[++index] = c - '0';
            }

        }

        return result[0]+result[1]+result[2];
    }


}
