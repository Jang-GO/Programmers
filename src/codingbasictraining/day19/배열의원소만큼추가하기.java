package codingbasictraining.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열의원소만큼추가하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5,1,4})));
        System.out.println(Arrays.toString(solution(new int[]{6,6})));
    }
    private static int[] solution(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}
