package codingintroductiontraning.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 약수구하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24)));
        System.out.println(Arrays.toString(solution(29)));
    }
    private static int[] solution(int n){
        List<Integer> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0) li.add(i);
        }
        return li.stream().mapToInt(x->x).toArray();
    }
}
