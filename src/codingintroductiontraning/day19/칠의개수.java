package codingintroductiontraning.day19;

public class 칠의개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7,77,17}));
        System.out.println(solution(new int[]{10,29}));
    }
    private static int solution(int[] array){
        int cnt=0;
        for(int ss:array){
            String sa = String.valueOf(ss);
            for(int i=0;i<sa.length();i++){
                if(sa.charAt(i)=='7') cnt++;
            }
        }
        return cnt;
    }
}
