package codingbasictraining.day23;

public class 날짜비교하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}));
        System.out.println(solution(new int[]{1024, 10, 24}, new int[]{1024, 10, 24}));
    }
    private static int solution(int[] date1, int[] date2){
        int answer=0;
        for(int i=0;i<3;i++){
            if (date1[i] < date2[i]) {
                answer = 1;
                break;
            }else if(date1[i]>date2[i]){
                answer=0;
                break;
            }
        }
        return answer;
    }
}
