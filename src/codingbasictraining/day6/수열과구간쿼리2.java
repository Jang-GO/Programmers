package codingbasictraining.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 수열과구간쿼리2 {
    public static void main(String[] args) {
         int[] arr = {0,1,2,4,3};
         int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};

         System.out.println(Arrays.toString(solution(arr,queries)));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        for (int[] query : queries) {
            int min =Integer.MAX_VALUE;
            int start = query[0];
            int end = query[1];
            int target = query[2];
            for(int i=start;i<=end;i++){
                if(arr[i]<min && arr[i] >target) min = arr[i];
            }
            if(min==Integer.MAX_VALUE) min=-1;
            answer.add(min);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
