package codingintroductiontraning.day21;

import java.util.ArrayList;
import java.util.List;

public class 안전지대 {
    static int[] dx = {1,1,0,-1,-1,-1,0,1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0, 0, 0, 0, 0},{0, 0, 1, 0, 0},{0, 0, 0, 0, 0}}));
        System.out.println(solution(new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0, 0, 0, 0, 0},{0, 0, 1, 1, 0},{0, 0, 0, 0, 0}}));
        System.out.println(solution(new int[][]{{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1}}));
    }
    private static int solution(int[][] board){
        int answer=0;
        List<int[]> bombList = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==1) bombList.add(new int[]{i,j});
            }
        }
        for(int i=0;i<bombList.size();i++){
            int x = bombList.get(i)[0];
            int y = bombList.get(i)[1];
            for(int j=0;j<8;j++){
                if(x+dx[j]>=0 && y+dy[j]>=0 && x+dx[j]<= board.length-1 && y+dy[j]<=board.length-1)
                    board[x+dx[j]][y+dy[j]]=1;
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==0) answer++;
            }
        }
        return answer;
    }
}
