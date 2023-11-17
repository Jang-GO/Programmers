package codingbasictraining.day7;

import java.util.Arrays;
import java.util.Stack;

public class 배열만들기4 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(Arrays.toString(solution(arr)));
    }
    private static int[] solution(int[] arr){
        int i=0;
        Stack<Integer> stk = new Stack<>();
        while(i<arr.length){
            if(stk.isEmpty()) stk.push(arr[i++]);
            else if(stk.peek()<arr[i]) stk.push(arr[i++]);
            else if(stk.peek()>= arr[i]) stk.pop();
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
