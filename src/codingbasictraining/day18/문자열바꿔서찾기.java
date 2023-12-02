package codingbasictraining.day18;

public class 문자열바꿔서찾기 {
    public static void main(String[] args) {
        System.out.println(solution("ABBAA","AABB"));
        System.out.println(solution("ABAB","ABAB"));
    }
    private static int solution(String myString, String pat){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)=='A') sb.append('B');
            else sb.append('A');
        }
        return sb.toString().contains(pat) ? 1 : 0;
    }
}
