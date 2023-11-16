package codingbasictraining.day5;

public class 등차수열의특별한항만더하기 {
    public static void main(String[] args) {
        int a= 3;
        int b= 4;
        boolean[] included = {true, false, false, true, true};
        System.out.println(solution(a,b,included));
    }
    public static int solution(int a, int b, boolean[] included){
        int sum=0;
        for(int i=0;i<included.length;i++){
            if(included[i]){
                sum+=a+(i*b);
            }
        } return sum;
    }
}
