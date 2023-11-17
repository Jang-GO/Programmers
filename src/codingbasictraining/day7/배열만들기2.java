package codingbasictraining.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열만들기2 {
    public static void main(String[] args) {
        int l1 = 5, r1=555, l2 = 10, r2 = 20;
        System.out.println(Arrays.toString(solution(l1,r1)));
        System.out.println(Arrays.toString(solution(l2,r2)));
    }
    private static int[] solution(int l, int r){
        List<Integer> list = new ArrayList<>();
        for(int i=l; i<=r;i++){
            String tmp = i+"";
            int count =0;
            for(char ss:tmp.toCharArray()){
                if(ss=='5' || ss=='0'){
                    count ++;
                }
            }
            if(count==tmp.length()) list.add(i);
        }
        if(list.isEmpty()) list.add(-1);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
