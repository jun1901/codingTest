package programmers.level1;

public class Solution52 { // 핸드폰 번호 가리기 - https://programmers.co.kr/learn/courses/30/lessons/12948?language=java
    public static void main(String[] args) {
        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }

    public static StringBuffer solution(String phone_number) {
        StringBuffer answer = new StringBuffer();
        int l = phone_number.length()-4;
        for (int i = 0; i < l; i++) answer.append("*");
        answer.append(phone_number.substring(l));
        return answer;
    }

}