package codingintroductiontraning.day24;

import java.util.Arrays;

public class A로B만들기 {
    public static void main(String[] args) {
        System.out.println(solution("olleh","hello"));
        System.out.println(solution("allpe","apple"));
    }
    private static int solution(String before,String after){
        String[] befArr = before.split("");
        String[] aftArr = after.split("");
        Arrays.sort(befArr);
        Arrays.sort(aftArr);
        if(Arrays.equals(befArr, aftArr)) return 1;
        else return 0;
    }
}
