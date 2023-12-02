package codingintroductiontraning.day18;

import java.util.Arrays;

public class 문자열정렬하기2 {
    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
        System.out.println(solution("heLLo"));
        System.out.println(solution("Python"));
    }
    private static String solution(String my_string){
        String answer="";
        my_string = my_string.toLowerCase();
        char[] ch = my_string.toCharArray();
        Arrays.sort(ch);
        for(char s :ch){
            answer+=s;
        }
        return answer;
    }
}
