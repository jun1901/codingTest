package programmers.level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution6 { // 크레인 인형뽑기 게임 - https://programmers.co.kr/learn/courses/30/lessons/64061?language=java
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board,moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0,movesIdx = 0, basketIdx = 0;
        int [] basket = new int [moves.length];
        while(movesIdx < moves.length){
            int j = moves[movesIdx]-1;
            for(int i = 0; i < board.length; i++){
                if(board[i][j] != 0)    {
                    basket[basketIdx] = board[i][j];
                    board[i][j] = 0;
                    if(basketIdx >=1 && basket[basketIdx] == basket[basketIdx-1]){
                        basket[basketIdx] = basket[basketIdx-1] = 0;
                        answer += 2;
                        basketIdx -=2;
                    }
                    basketIdx++;
                    break;
                }
            }
            movesIdx++;
        }
        /*
        int answer = 0, n =0;
        int movesIdx = 0;
        Stack<Integer> basket = new Stack<>();
        while(movesIdx < moves.length){
            int j = moves[movesIdx]-1;
            for(int i = 0; i < board.length; i++){
                if(board[i][j] != 0)    {
                    n = board[i][j];
                    board[i][j] = 0;
                    if(!basket.isEmpty() && basket.peek() == n){
                        basket.pop();
                        answer += 2;
                    } else basket.push(n);
                    break;
                }
            }
            movesIdx++;
        }

         */
        /*
        int answer = 0, n=0;
        ArrayList<Queue<Integer>> base = new ArrayList<>();
        Stack<Integer> basket = new Stack<>();
        for (int i = -1; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(i != -1 ) {if(board[i][j] != 0)base.get(j).offer(board[i][j]);}
                else base.add(new LinkedList<>());
            }
        }
        for (int i = 0; i < base.size(); i++) {
            System.out.println(i);
            base.get(i).forEach(s -> System.out.printf("%d ",s));
            System.out.println();
        }
        System.out.println("\n\n");
        for (int i = 0; i < moves.length; i++) {
            if(!base.get(moves[i]-1).isEmpty()) {
                n = base.get(moves[i] - 1).poll();
                if (!basket.isEmpty() && basket.peek() == n) {
                    basket.pop();
                    answer += 2;
                } else basket.push(n);
                basket.forEach(s -> System.out.printf("%d ", s));
                System.out.println();
            }
        }

         */
        return answer;
    }


}
