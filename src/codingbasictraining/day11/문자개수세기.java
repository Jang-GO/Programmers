package codingbasictraining.day11;

import java.util.Arrays;

public class 문자개수세기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("Programmers")));
    }
    private static int[] solution(String my_string){
        int[] answer = new int[52];
        for(int i=0;i<my_string.length();i++){
            char tmp = my_string.charAt(i);
            if(Character.isLowerCase(tmp)){
                answer[tmp-'a'+32]++;
            }else{
                answer[tmp-'A']++;
            }
        }
        return answer;
    }
}
