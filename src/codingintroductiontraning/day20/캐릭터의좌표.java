package codingintroductiontraning.day20;

import java.util.Arrays;

public class 캐릭터의좌표 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"left", "right", "up", "right", "right"},new int[]{11,11})));
        System.out.println(Arrays.toString(solution(new String[]{"down", "down", "down", "down", "down"},new int[]{7,9})));
    }
    private static int[] solution(String[] keyinput, int[] board){
        int[] answer = new int[2];
        for(String ss:keyinput){
            if(ss.equals("up")) {
                if(answer[1]+1>board[1]/2) answer[1]=board[1]/2;
                else answer[1]++;
            }
            if(ss.equals("down")) {
                if(answer[1]-1< -board[1]/2) answer[1]=-board[1]/2;
                else answer[1]--;
            }
            if(ss.equals("right")){
                if(answer[0]+1>board[0]/2) answer[0]=board[0]/2;
                else answer[0]++;
            }
            if(ss.equals("left")){
                if(answer[0]-1< -board[0]/2) answer[0]= -board[0]/2;
                else answer[0]--;
            }
        }
        return answer;
    }
}
