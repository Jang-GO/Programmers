package codingbasictraining.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열잘라서정렬하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("axbxcxdx")));
        System.out.println(Arrays.toString(solution("dxccxbbbxaaaa")));
    }
    private static String[] solution(String str){
        String[] arr = str.split("x");
        List<String> list = new ArrayList<>();
        for(String ss:arr){
            if(ss.isEmpty()) continue;
            else list.add(ss);
        }
        String[] array = list.toArray(new String[0]);
        Arrays.sort(array);
        return array;
    }
}
