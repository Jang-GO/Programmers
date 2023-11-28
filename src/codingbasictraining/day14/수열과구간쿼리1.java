package codingbasictraining.day14;

import java.util.Arrays;

public class 수열과구간쿼리1 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,1},{1,2},{2,3}};
        System.out.println(Arrays.toString(solution(arr,queries)));
    }
    private static int[] solution(int[] arr, int[][] queries){
        int[] answer = Arrays.copyOf(arr, arr.length);
        for(int[] query:queries){
            for(int i=query[0];i<=query[1];i++){
                answer[i]++;
            }
        }
        return answer;
    }
}
