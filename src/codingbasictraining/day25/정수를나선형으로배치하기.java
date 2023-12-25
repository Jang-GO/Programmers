package codingbasictraining.day25;

public class 정수를나선형으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(4));
        System.out.println(solution(5));
    }
    private static int[][] solution(int n){
        int[][] answer = new int[n][n];
        int value = 1;
        int x=0; int y=0;
        int direction=0; // 0 -> , 1 아래방향 , 2 <- , 3 위방향
        while(value<= n*n){
            answer[y][x]=value++;
            if (direction == 0) {
                if(x==n-1 || answer[y][x+1]!=0){
                    direction=1;
                    y++;
                }else{
                    x++;
                }
            }
            else if(direction==1){
                if(y==n-1 || answer[y+1][x]!=0){
                    direction = 2;
                    x--;
                }else{
                    y++;
                }
            }
            else if(direction==2){
                if(x==0 || answer[y][x-1]!=0){
                    direction = 3;
                    y--;
                }else{
                    x--;
                }
            }
            else if(direction==3){
                if(y==0 || answer[y-1][x]!=0){
                    direction=0;
                    x++;
                }else{
                    y--;
                }
            }
        }
        return answer;
    }
}
