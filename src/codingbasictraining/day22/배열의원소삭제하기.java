package codingbasictraining.day22;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class 배열의원소삭제하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{293, 1000, 395, 678, 94},new int[]{94, 777, 104, 1000, 1, 12})));
        System.out.println(Arrays.toString(solution(new int[]{110, 66, 439, 785, 1},new int[]{377, 823, 119, 43})));
    }
    private static int[] solution(int[] arr, int[] delete_list){
        List<Integer> list = new Vector<>();
        for(int i=0;i<arr.length;i++){
            boolean distinct = true;
            for(int j=0;j<delete_list.length;j++){
                if(arr[i]==delete_list[j]) distinct=false;
            }
            if(distinct) list.add(arr[i]);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}
