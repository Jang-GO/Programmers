package codingbasictraining.day15;

import java.util.stream.Stream;

public class 원하는문자열찾기 {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG","aBc"));
        System.out.println(solution("aaAA","aaaaa"));
    }
    private static int solution(String myString, String pat){
        myString=myString.toLowerCase();
        pat = pat.toLowerCase();
        return myString.contains(pat) ? 1 : 0;
    }
}
