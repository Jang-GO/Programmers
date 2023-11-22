package codingbasictraining.day11;

public class 글자지우기 {
    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }
    private static String solution(String my_string, int[] indices){
        String answer="";
        String[] tmp = my_string.split("");
        for(int ss:indices){
            tmp[ss]="";
        }
        for(String ss:tmp){
            answer+=ss;
        }
        return answer;
    }
}

