package codingintroductiontraning.day21;

public class 숨어있는숫자의덧셈2 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }
    private static int solution(String my_string){
        int sum=0;
        String[] intStr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        for(String ss:intStr){
            if(!ss.equals("")) sum+=Integer.parseInt(ss);
        }
        return sum;
    }
}
