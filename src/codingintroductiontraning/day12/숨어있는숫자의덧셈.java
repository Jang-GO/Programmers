package codingintroductiontraning.day12;

public class 숨어있는숫자의덧셈 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }
    private static int solution(String my_string){
        String[] tmp = my_string.replaceAll("[^0-9]","").split("");
        int sum=0;
        for(String ss:tmp){
            sum+=Integer.parseInt(ss);
        }
        return sum;
    }
}
