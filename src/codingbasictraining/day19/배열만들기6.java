package codingbasictraining.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열만들기6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0,1,1,1,0})));
        System.out.println(Arrays.toString(solution(new int[]{0,1,0,1,0})));
        System.out.println(Arrays.toString(solution(new int[]{0,1,1,0})));
    }
    private static int[] solution(int[] arr){
        int i=0;
        List<Integer> list = new ArrayList<>();
        while(i<arr.length){
            if(list.isEmpty()){
                list.add(arr[i++]);
            }else if(list.get(list.size()-1)==arr[i]){
                list.remove(list.size()-1);
                i++;
            }else{
                list.add(arr[i++]);
            }
        }
        if(list.isEmpty()) list.add(-1);
         return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
