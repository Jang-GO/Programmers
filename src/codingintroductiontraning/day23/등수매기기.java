package codingintroductiontraning.day23;

import java.util.Arrays;

public class 등수매기기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[][]{{80,70},{90,50},{40,70},{50,80}})));
        System.out.println(Arrays.toString(solution(new int[][]{{80,70},{70,80},{30,50},{90,100},{100,90},{100,100},{10,30}})));
    }
    private static int[] solution(int[][] score){
        int[] avgArr = new int[score.length];
        int[] rank = new int[score.length];
        int idx=0;
        for(int[] scores:score){
            avgArr[idx++] = Arrays.stream(scores).sum();
        }
        for(int i=0;i<avgArr.length;i++){
            int rk = 1;
            for(int j=0;j<avgArr.length;j++){
                if(avgArr[i] < avgArr[j]) rk++;
            }
            rank[i] = rk;
        }
        return rank;
    }
}
