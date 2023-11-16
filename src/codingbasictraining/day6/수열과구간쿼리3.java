package codingbasictraining.day6;

import java.util.Arrays;

public class 수열과구간쿼리3 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,3},{1,2},{1,4}};

        System.out.println(Arrays.toString(solution(arr,queries)));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        return arr;
    }
}
