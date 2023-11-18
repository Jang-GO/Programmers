package codingbasictraining.day8;

public class 문자열여러번뒤집기 {
    public static void main(String[] args) {
        int[] queries2 = {2,3};
        int[] queries3 = {0,7};
        int[] queries4 = {5,9};
        int[] queries5 = {6,10};
        int[][] queries = new int[][]{queries2,queries3,queries4,queries5};
        String my_string = "rermgorpsam";
        char[] toto = my_string.toCharArray();
        String my_str = new String(toto);
        System.out.println(my_string.equals(my_str));

        System.out.println(solution(my_string,queries));
    }
    private static String solution(String my_string, int[][] queries){
        String answer = my_string;
        for(int[] query:queries){
            String a = answer.substring(0,query[0]);
            String b = answer.substring(query[0],query[1]+1);
            String c = answer.substring(query[1]+1);
            answer = a+reverse(b)+c;
        }
        return answer;
    }
    private static String reverse(String str){
        String tmp = "";
        for(int i=str.length()-1;i>=0;i--){
            tmp+=str.charAt(i);
        }
        return tmp;
    }
}
