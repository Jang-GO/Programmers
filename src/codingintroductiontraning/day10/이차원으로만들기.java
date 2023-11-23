package codingintroductiontraning.day10;

import java.util.Arrays;

public class 이차원으로만들기 {
    public static void main(String[] args) {
        for(int i=0;i<8;i++){
            for(int j=0;j<2;j++){
                System.out.println(solution(new int[]{1,2,3,4,5,6,7,8},2)[i][j]);
            }
        }
    }
    private static int[][] solution(int[] num_list, int n){
        int size = num_list.length / n;
        int[][] answer = new int[size][n];
        int idx =0;
        for(int i=0;i<size;i++){
            for(int j=0;j<n;j++){
                answer[i][j] = num_list[idx++];
            }
        }
        return answer;
    }
}
