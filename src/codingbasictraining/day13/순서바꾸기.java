package codingbasictraining.day13;

import java.util.Arrays;
import java.util.Stack;

public class 순서바꾸기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6},1)));
        System.out.println(Arrays.toString(solution(new int[]{5,2,1,7,5},3)));
    }
    private static int[] solution(int[] num_list, int n){
        Stack<Integer> st1 = new Stack<>();
        for(int i=n;i< num_list.length;i++){
            st1.push(num_list[i]);
        }
        for(int i=0;i<n;i++){
            st1.push(num_list[i]);
        }
        return st1.stream().mapToInt(x->x).toArray();
    }
}
