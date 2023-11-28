package codingbasictraining.day14;

public class 홀수vs짝수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,2,6,1,7,6}));
        System.out.println(solution(new int[]{-1,2,5,6,3}));
    }
    private static int solution(int[] num_list){
        int evenSum=0;
        int oddSum=0;
        boolean isOdd = true;
        for(int ss:num_list){
            if(isOdd){
                oddSum+=ss;
                isOdd = false;
            }else{
                evenSum+=ss;
                isOdd = true;
            }
        }
        return Math.max(evenSum,oddSum);
    }
}
