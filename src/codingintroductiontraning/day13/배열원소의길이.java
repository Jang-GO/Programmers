package codingintroductiontraning.day13;

import java.util.Arrays;

public class 배열원소의길이 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"We", "are", "the", "world!"})));
        System.out.println(Arrays.toString(solution(new String[]{"I", "Love", "Programmers."})));
    }
    private static int[] solution(String[] strlist){
        int[] answer = new int[strlist.length];
        for(int i=0;i< strlist.length;i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
