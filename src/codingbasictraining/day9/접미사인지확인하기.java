package codingbasictraining.day9;

import java.util.ArrayList;
import java.util.List;

public class 접미사인지확인하기 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix1 = "ana",is_suffix2 = "nan", is_suffix3="wxyz", is_suffix4="abanana";
        System.out.println(solution(my_string,is_suffix1));
        System.out.println(solution(my_string,is_suffix2));
        System.out.println(solution(my_string,is_suffix3));
        System.out.println(solution(my_string,is_suffix4));
    }
    private static int solution(String my_string, String is_suffix) {
        List<String> list = new ArrayList<>();
        boolean tmp = false;
        for(int i=0;i<my_string.length();i++){
            list.add(my_string.substring(i));
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(is_suffix)) tmp = true;
        }
        return tmp ? 1 : 0;
    }
}
