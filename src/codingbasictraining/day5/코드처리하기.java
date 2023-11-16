package codingbasictraining.day5;

public class 코드처리하기 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        System.out.println(solution(code));
    }
    public static String solution(String code){
        String answer="";
        int mode =0;
        for(int i=0;i<code.length();i++){
            if(code.charAt(i)=='1') {
                mode = 1 - mode;
                continue;
            }
            if(mode==1 && i%2==1) answer +=code.charAt(i);
            else if(mode==0 && i%2==0)  answer += code.charAt(i);
        }
        return "".equals(answer) ? "EMPTY" : answer;
    }
}
