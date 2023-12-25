package codingbasictraining.day25;

public class 특이한이차원배열2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{5, 192, 33},{192, 72, 95},{33, 95, 999}}));
    }
    private static int solution(int[][] arr){
        int answer =1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=arr[j][i]) answer =0;
            }
        }
        return answer;
    }
}
