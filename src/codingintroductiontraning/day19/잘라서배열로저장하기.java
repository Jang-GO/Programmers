package codingintroductiontraning.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 잘라서배열로저장하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b",6)));
        System.out.println(Arrays.toString(solution("abcdef123",3)));
    }
    private static String[] solution(String my_str, int n){
        int cnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[cnt];
        for(int i = 0; i < cnt; i++){
            int start = n * i;
            int end = 0;
            if(start + n >= my_str.length()){
                end = my_str.length();
            } else {
                end = start + n;
            }
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}
