package codingbasictraining.day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 전국대회선발고사 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 7, 2, 5, 4, 6, 1},new boolean[]{false, true, true, true, true, false, false}));
    }
    private static int solution(int[] rank, boolean[] attendance){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<rank.length;i++){
            if(attendance[i]) list.add(rank[i]);
        }
        Collections.sort(list);
        int ss= 10000;
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<rank.length;j++){
                if(list.get(i)==rank[j]){
                   sum+=ss * j;
                   ss/=100;
                }
            }
        }
        return sum;
    }
}