package codingbasictraining.day17;

public class 문자열이몇번등장하는지세기 {
    public static void main(String[] args) {
        System.out.println(solution("banana","ana"));
        System.out.println(solution("aaaa","aa"));
    }
    private static int solution(String myString, String pat){
        int startIdx = 0;
        int endIdx=pat.length()-1;
        int cnt =0;
        for(int i=0;i<myString.length()-pat.length()+1;i++){
            if(myString.substring(startIdx,endIdx+1).equals(pat)) cnt++;
            startIdx++; endIdx++;
        }
        return cnt;
    }
}
