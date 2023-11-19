package codingbasictraining.day9;

public class 부분문자열이어붙여문자열만들기 {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        System.out.println(solution(my_strings, parts));
    }
    private static String solution(String[] my_strings, int[][] parts){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< parts.length;i++){
            String tmp = my_strings[i].substring(parts[i][0],parts[i][1]+1);
            sb.append(tmp);
        }
        return sb.toString();
    }
}
