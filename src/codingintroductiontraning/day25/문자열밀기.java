package codingintroductiontraning.day25;

public class 문자열밀기 {
    public static void main(String[] args) {
        System.out.println(solution("hello","ohell"));
        System.out.println(solution("apple","elppa"));
        System.out.println(solution("atat","tata"));
        System.out.println(solution("abc","abc"));
    }
    private static int solution(String A, String B){
        int cnt =0;
        String tmp = A;
        for(int i=0;i<A.length();i++) {
            if(tmp.equals(B)) return cnt;
            String ss = tmp.substring(tmp.length()-1);
            tmp =  ss + tmp.substring(0,tmp.length()-1);
            cnt++;
        }
        return -1;
    }
}
