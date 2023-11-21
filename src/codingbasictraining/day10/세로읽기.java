package codingbasictraining.day10;

public class 세로읽기 {
    public static void main(String[] args) {
        String my_string1 = "ihrhbakrfpndopljhygc", my_string2 = "programmers";
        int m1= 4, m2 = 1, c1 = 2, c2= 1;
        System.out.println(solution(my_string1,m1,c1));
        System.out.println(solution(my_string2,m2,c2));
    }
    private static String solution(String my_string, int m, int c){
        int len = my_string.length()/m;
        String[] answer = new String[len];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++){
            answer[i] = my_string.substring(i*m,(i+1)*m);
        }
        for(String ss:answer){
            sb.append(ss.charAt(c-1));
        }
        return sb.toString();
    }
}
