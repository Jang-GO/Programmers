package codingbasictraining.day24;

import java.util.Arrays;

public class 특별한이차원배열1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3)));
        System.out.println(Arrays.toString(solution(6)));
        System.out.println(Arrays.toString(solution(1)));
    }
    private static int[][] solution(int n){
        int[][] answer = new int[n][n];
        for(int i=0;i<answer.length;i++){
            answer[i][i] = 1;
        }
        return answer;
    }
}
