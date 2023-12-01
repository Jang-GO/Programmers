package codingintroductiontraning.day17;

import java.util.Arrays;

public class OX퀴즈 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
    }
    private static String[] solution(String[] quiz){
        String[] answer = new String[quiz.length];
        for(int i=0;i< quiz.length;i++){
            String[] tmp = quiz[i].split(" ");
            int n1 = Integer.parseInt(tmp[0]);
            int n2 = Integer.parseInt(tmp[2]);
            int n3 = Integer.parseInt(tmp[4]);

            if(tmp[1].equals("+")){
                answer[i] = n1+n2==n3 ? "O" : "X";
            }
            if(tmp[1].equals("-")){
                answer[i] = n1-n2==n3 ? "O" : "X";
            }
        }
        return answer;
    }
}
