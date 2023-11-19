package codingbasictraining.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 접미사배열 {
    public static void main(String[] args) {
        String my_string ="banana";
        System.out.println(Arrays.toString(solution(my_string)));
    }
    private static String[] solution(String my_string){
        List<String> list = new ArrayList<>();
        for(int i=0;i<my_string.length();i++){
            list.add(my_string.substring(i));
        }
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
}
