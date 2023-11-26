package codingintroductiontraning.day13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class 중복된문자제거 {
    public static void main(String[] args) {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));
    }
    private static String solution(String my_string){
        StringBuilder sb = new StringBuilder();
        Set<String> set = new LinkedHashSet<>(Arrays.asList(my_string.split("")));
        for(String ss:set){
            sb.append(ss);
        }
        return sb.toString();
    }
}
