package codingintroductiontraning.day24;

public class k의개수 {
    public static void main(String[] args) {
        System.out.println(solution(1,13,1));
        System.out.println(solution(10,50,5));
        System.out.println(solution(3,10,2));
    }
    private static int solution(int i, int j, int k){
        int cnt=0;
        String target = String.valueOf(k);
        for(int s=i;s<=j;s++){
            String tmp = String.valueOf(s);
            for(int a=0;a<tmp.length();a++){
                if(target.equals(tmp.substring(a,a+1))) cnt++;
            }
        }
        return cnt;
    }
}
