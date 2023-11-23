package codingbasictraining.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 왼쪽오른쪽 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"u","u","l","r"})));
        System.out.println(Arrays.toString(solution(new String[]{"l"})));
    }
    private static String[] solution(String[] str_list){
        List<String> list = new ArrayList<>();
        int idx=0;
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].equals("l")){
                idx = i;
                for(int j=0;j<idx;j++){
                    list.add(str_list[j]);
                }
                break;
            }else if(str_list[i].equals("r")){
                idx = i;
                for(int j=idx+1;j < str_list.length;j++){
                    list.add(str_list[j]);
                }
                break;
            }
        }
        return list.toArray(new String[0]);
    }
}
