package codingbasictraining.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열만들기3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5},new int[][]{{1,3},{0,4}})));
    }
    private static int[] solution(int[] arr, int[][] intervals){
        List<Integer> list = new ArrayList<>();
        for(int i=intervals[0][0]; i<= intervals[0][1];i++){
            list.add(arr[i]);
        }
        for(int i=intervals[1][0]; i<= intervals[1][1];i++){
            list.add(arr[i]);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}
