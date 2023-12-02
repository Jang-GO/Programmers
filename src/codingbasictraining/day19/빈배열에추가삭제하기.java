package codingbasictraining.day19;

import java.util.Arrays;
import java.util.Stack;

public class 빈배열에추가삭제하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 4, 1, 3},new boolean[]{true, false, true, false, false})));
    }
    private static int[] solution(int[] arr, boolean[] flag){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<flag.length;i++){
            if(flag[i]){
                for(int j=0;j<arr[i]*2;j++){
                    st.push(arr[i]);
                }
            }else{
                for(int j=0;j<arr[i];j++){
                    st.pop();
                }
            }
        }
        return st.stream().mapToInt(x->x).toArray();
    }
}
