package codingbasictraining.day15;

public class 일로만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{12,4,15,1,14}));
    }
    private static int solution(int[] num_list){
        int cnt=0;
        for(int i=0;i<num_list.length;i++){
            while(num_list[i]!=1){
                if(num_list[i]%2==0){
                    num_list[i]/=2;
                    cnt++;
                }else{
                    num_list[i]-=1;
                    num_list[i]/=2;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
