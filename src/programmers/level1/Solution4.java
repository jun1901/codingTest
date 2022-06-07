package programmers.level1;

public class Solution4 { // 숫자 문자열과 영단어 - https://programmers.co.kr/learn/courses/30/lessons/81301?language=java
    public static void main(String[] args) {
        System.out.println(solution("23four5six7"));
    }

    public static int solution(String s){
        String [] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuffer answer = new StringBuffer();
        char c;
        for (int i = 0,k=1; i < s.length(); i += k) {
            c = s.charAt(i);
            if('0' <= c && c <= '9') {
                answer.append(c);
                k=1;
            }else{
                for (int j = 0; j < nums.length; j++) {
                    k = nums[j].length();
                    if(i+k <= s.length() && nums[j].equals(s.substring(i,i+k))){
                        answer.append(j);
                        break;
                    }
                }
            }
        }

        return Integer.parseInt(String.valueOf(answer));
    }


}
