package codingbasictraining.day18;

import java.util.Arrays;

public class x사이의개수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("oxooxoxxox")));
        System.out.println(Arrays.toString(solution("xabcxdefxghi")));
    }
    private static int[] solution(String myString){
        String[] splitArr = myString.split("x", myString.length());
        int[] answer = new int[splitArr.length];

        for (int i = 0; i < splitArr.length; i++) {
            answer[i] = splitArr[i].length();
        }
        return answer;
    }
}
