package codingintroductiontraning.day25;

public class 다음에올숫자 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}));
        System.out.println(solution(new int[]{2,4,8}));
    }
    private static int solution(int[] common){
        boolean isGB = true;
        if(common[1]-common[0] == common[2]-common[1]){
            isGB = false;
        }
        if(!isGB){
            int GC = common[1]-common[0];
            return common[common.length-1]+GC;
        }else{
            int GB = common[1]/common[0];
            return common[common.length-1]*GB;
        }
    }
}
