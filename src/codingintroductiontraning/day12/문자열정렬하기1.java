package codingintroductiontraning.day12;

import java.util.Arrays;

public class 문자열정렬하기1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hi12392")));
        System.out.println(Arrays.toString(solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(solution("abcde0")));
    }
    private static int[] solution(String my_string){
        String[] tmp = my_string.replaceAll("[^0-9]","").split("");
        int[] answer = new int[tmp.length];
        int i=0;
        for(String ss:tmp){
            answer[i++] = Integer.parseInt(ss);
        }
        Arrays.sort(answer);
        return answer;

    }
}
