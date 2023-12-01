package codingbasictraining.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ad제거하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"and","notad","abcd"})));
        System.out.println(Arrays.toString(solution(new String[]{"there","are","no","a","ds"})));
    }
    private static String[] solution(String[] strArr){
        List<String> list = new ArrayList<>();
        for(String ss:strArr){
            if(!ss.contains("ad")) list.add(ss);
        }
        return list.toArray(new String[0]);
    }
}
