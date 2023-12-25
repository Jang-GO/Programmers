package codingbasictraining.day25;

import java.util.Arrays;

public class 정사각형으로만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[][]{{572, 22, 37},{287, 726, 384},{85, 137, 292},{487, 13, 876}})));
    }
    private static int[][] solution(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int large = Math.max(row,col);
        int[][] answer = new int[large][large];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}
