package codingbasictraining.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 무작위로K개의수뽑기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0,1,1,2,2,3},3)));
        System.out.println(Arrays.toString(solution(new int[]{0,1,1,1,1},4)));
    }
    private static int[] solution(int[] arr, int k){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(list.size()==k) break;
            if(!list.contains(arr[i])) list.add(arr[i]);
        }

        while(list.size()<k){
            list.add(-1);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}
