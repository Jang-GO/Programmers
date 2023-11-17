package codingbasictraining.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 콜라츠수열만들기 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(solution(n)));
    }
    private static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int tmp = n;
        while(tmp!=1){
            list.add(tmp);
            if(tmp%2==0) tmp /=2;
            else tmp=3*tmp+1;
        }
        list.add(1);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
