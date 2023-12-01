package codingbasictraining.day17;

public class 특정문자열로끝나는가장긴부분문자열찾기 {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG","dE"));
        System.out.println(solution("AAAAaaaa","a"));
    }
    private static String solution(String myString, String pat){
        StringBuilder sb = new StringBuilder();
        String answer= "";
        for(int i=0;i<myString.length();i++){
            sb.append(myString.charAt(i));
            if(sb.toString().endsWith(pat)) answer=sb.toString();
        }
        return answer;
    }
}
