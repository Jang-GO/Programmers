package codingbasictraining.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 리스트자르기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
    }
    private static int[] solution(int n, int[] slicer, int[] num_list){
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if(n == 1) {
            for(int i =0; i<b+1; i++) {
                list.add(num_list[i]);
            }
        }else if(n == 2) {
            for(int i = a; i<num_list.length; i++) {
                list.add(num_list[i]);
            }
        }else if(n ==3) {
            for(int i = a; i<b+1; i++) {
                list.add(num_list[i]);
            }
        }else if(n == 4) {
            for(int i = a; i<b+1; i+=c) {
                list.add(num_list[i]);

            }
        }
        int[] answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}
