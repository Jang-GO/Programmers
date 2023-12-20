package codingbasictraining.day21;

public class 문자열정수의합 {
    public static void main(String[] args){
        System.out.println(solution("123456789"));
        System.out.println(solution("1000000"));
    }
    private static int solution(String num_str){
        int sum=0;
        char[] ss = num_str.toCharArray();
        for(char a:ss){
            sum+=a-'0';
        }
        return sum;
    }
}
