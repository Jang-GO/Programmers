package codingintroductiontraning.day5;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열뒤집기 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(num_list)));
    }
    private static int[] solution(int[] num_list){
        int[] answer = Arrays.copyOf(num_list,num_list.length);
        for(int i=0;i< answer.length/2;i++){
            int temp = answer[i];
            answer[i] = answer[answer.length-1-i];
            answer[answer.length-1-i] = temp;
        }
        return answer;
    }
    private static int[] solution2(int[] num_list){
        Integer[] arr = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);

        Collections.reverse(list);
        Integer[] reverseArr = list.toArray(arr);
        return Arrays.stream(reverseArr).mapToInt(Integer::intValue).toArray();
    }
}
