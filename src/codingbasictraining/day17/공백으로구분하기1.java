package codingbasictraining.day17;

import java.util.Arrays;

public class 공백으로구분하기1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("i love you")));
        System.out.println(Arrays.toString(solution("programmers")));
    }
    private static String[] solution(String my_string){
        return my_string.split(" ");
    }
}
