package codingbasictraining.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n개간격의원소들 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4 ,2, 6, 1, 7, 6},2)));
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6},4)));
    }
    private static int[] solution(int[] num_list, int n){
        List<Integer> list = new ArrayList<>();
        list.add(num_list[0]);
        for(int i=n;i< num_list.length;i+=n){
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}
