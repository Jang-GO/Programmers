package codingbasictraining.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class 배열만들기1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10,3)));
        System.out.println(Arrays.toString(solution(15,5)));
    }
    private static int[] solution(int n, int k){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%k==0) list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
