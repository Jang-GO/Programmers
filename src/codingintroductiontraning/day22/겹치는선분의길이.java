package codingintroductiontraning.day22;

public class 겹치는선분의길이 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0,1},{2,5},{3,9}}));
        System.out.println(solution(new int[][]{{-1,1},{1,3},{3,9}}));
        System.out.println(solution(new int[][]{{0,5},{3,9},{1,10}}));
    }
    private static int solution(int[][] lines) {
        int answer=0;
        int[] arr = new int[201];
        for(int[] ss:lines) {
            int start=ss[0] + 100;
            int end = ss[1] + 100;
            for(int i=start;i<end;i++) {
                arr[i]++;
            }
        }

        for(int i:arr) {
            if(i>1) answer++;
        }
        return answer;
    }
}
