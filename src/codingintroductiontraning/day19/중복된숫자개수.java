package codingintroductiontraning.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 중복된숫자개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,2,3,4,5},1));
        System.out.println(solution(new int[]{0,2,3,4},1));

    }
    private static int solution(int[] array, int n){
        List<Integer> li = new ArrayList<>();
        for(int num:array){
            if(num==n){
                li.add(num);
            }
        }
        return li.size();
    }
}
