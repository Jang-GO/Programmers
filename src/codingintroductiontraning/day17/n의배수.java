package codingintroductiontraning.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n의배수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3,new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
        System.out.println(Arrays.toString(solution(5,new int[]{1, 9, 3, 10, 13, 5})));
        System.out.println(Arrays.toString(solution(12,new int[]{2,100,120,600,12,12})));
    }
    private static int[] solution(int n, int[] num_list){
        List<Integer>  list = new ArrayList<>();
        for(int ss:num_list){
            if(ss%n==0) list.add(ss);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}
