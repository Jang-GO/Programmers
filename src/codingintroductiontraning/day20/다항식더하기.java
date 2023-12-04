package codingintroductiontraning.day20;

public class 다항식더하기 {
    public static void main(String[] args) {
        System.out.println(solution("3x + 7 + x"));
        System.out.println(solution("x + x + x"));
    }
    private static String solution(String polynomial){
        String[] tmp = polynomial.split("[+]");
        int xnum =0;
        int num=0;
        for(String ss:tmp){
            String s = ss.trim();
            if(s.contains("x")){
                if(s.equals("x")) xnum+=1;
                else xnum+=Integer.parseInt(s.replaceAll("x",""));
            }else{
                num+=Integer.parseInt(s);
            }
        }
        String answer = "";
        if(xnum==0){
            if(num==0) return "";
            else answer+=num;
        }else if(xnum==1){
            if(num==0) answer+="x";
            else answer="x" + " + " + num;
        }
        else{
            if(num==0) answer+= xnum+"x";
            else answer= xnum + "x" + " + " + num;
        }
        return answer;
    }
}
