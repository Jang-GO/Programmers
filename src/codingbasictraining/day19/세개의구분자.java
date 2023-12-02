package codingbasictraining.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 세개의구분자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("baconlettucetomato")));
        System.out.println(Arrays.toString(solution("abcd")));
        System.out.println(Arrays.toString(solution("cabab")));
    }
    private static String[] solution(String myStr){
        List<String> list = new ArrayList<>();
        String tmp = myStr.replaceAll("[abc]","T");
        String[] tmpArr = tmp.split("T");
        for(int i=0;i<tmpArr.length;i++){
            if(tmpArr[i].isEmpty()) continue;
            else list.add(tmpArr[i]);
        }
        if(list.isEmpty()) list.add("EMPTY");
        return list.toArray(new String[0]);
    }
}
