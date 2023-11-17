package codingbasictraining.day7;

import java.util.Arrays;

public class 수열과구간쿼리4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};

        System.out.println(Arrays.toString(solution(arr,queries)));
    }
    private static int[] solution(int[] arr, int[][] queries){
        int[] answer = Arrays.copyOf(arr, arr.length);
        for(int[] query:queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            for(int i=s;i<=e;i++){
                if(i%k==0){
                    answer[i]+=1;
                }
            }
        }
        return answer;
    }
}
