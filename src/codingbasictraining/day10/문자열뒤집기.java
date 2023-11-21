package codingbasictraining.day10;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3",6,12));
        System.out.println(solution("Stanley1yelnatS",4,10));
    }
    private static String solution(String my_string, int s, int e){
        return my_string.substring(0,s) + reverse(my_string.substring(s,e+1)) + my_string.substring(e+1);
    }
    private static String reverse(String str){
        char[] tmp = str.toCharArray();
        for(int i=0;i<str.length()/2;i++){
            char tt = tmp[i];
            tmp[i] = tmp[tmp.length-1-i];
            tmp[tmp.length-1-i] = tt;
        }
        return String.valueOf(tmp);
    }
}
