package codingbasictraining.day4;

public class 조건문자열 {
    public static void main(String[] args) {
        System.out.println(solution("<","=",20,50));
        System.out.println(solution(">","!",41,78));
    }
    public static int solution(String ineq, String eq, int n, int m){
        if(ineq.equals(">") && eq.equals("=")){
            return (n>=m) ? 1 : 0;
        }else if((ineq.equals("<") && eq.equals("="))){
            return (n<=m) ? 1 : 0;
        }else if((ineq.equals(">") && eq.equals("!"))){
            return (n>m) ? 1 : 0;
        }else{
            return (n<m) ? 1 : 0;
        }
    }
}
