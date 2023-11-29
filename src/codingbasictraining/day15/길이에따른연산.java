package codingbasictraining.day15;

import java.util.Arrays;

public class 길이에따른연산 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
        System.out.println(solution(new int[]{2, 3, 4, 5}));
    }
    private static int solution(int[] num_list){
        if(num_list.length>=11){
            int sum = Arrays.stream(num_list).sum();
            return sum;
        }else{
            int mul = 1;
            for(int ss:num_list){
                mul*=ss;
            }
            return mul;
        }
    }
}
