package programmers.level1;

public class Solution49 { // 콜라츠 추측 - https://programmers.co.kr/learn/courses/30/lessons/12943?language=java
    public static void main(String[] args) {
        int num = 1;
        System.out.println(solution(num));
    }

    public static int solution(int num) {
        int answer = 0;
        while (answer <= 500 &&num > 1){
            if(num%2==0) num /= 2;
            else num = 3*num + 1;
            answer++;
        }

        return answer>=500 ? -1 : answer;
    }

}