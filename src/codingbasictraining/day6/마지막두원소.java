package codingbasictraining.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 마지막두원소 {
    public static void main(String[] args) {
        int[] num_list1 = {2,1,6};
        int[] num_list2 = {5,2,1,7,5};

        System.out.println(Arrays.toString(solution(num_list1)));
        System.out.println(Arrays.toString(solution(num_list2)));
    }

    private static int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for (int j : num_list) {
            list.add(j);
        }
        if(list.get(num_list.length-1)>list.get(num_list.length-2)){
            list.add(list.get(num_list.length-1)-list.get(num_list.length-2));
        }else{
            list.add(list.get(num_list.length-1)*2);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
