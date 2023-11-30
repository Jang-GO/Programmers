package codingintroductiontraning.day15;

public class 한번만등장한문자 {
    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abcd"));
        System.out.println(solution("hello"));
    }
    private static String solution(String s){
        String answer="";
        int[] al = new int[26];
        for(int i=0;i<s.length();i++){
            al[s.charAt(i)-97]++;
        }
        for(int i=0;i<al.length;i++){
            if(al[i]==1) answer+=(char)(i+97);
        }
        return answer;
    }
}
