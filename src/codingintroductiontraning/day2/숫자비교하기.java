package codingintroductiontraning.day2;

public class 숫자비교하기 {
    public static void main(String[] args) {
        int numer1 = 1, denom1 = 2, numer2 = 3, denom2 = 4;
        int numer3 = 9 , denom3 = 2, numer4 = 1, denom4 = 3;

        for(int i=0;i<2;i++){
            System.out.print(solution(numer1,denom1,numer2,denom2)[i] + " ");
        }
    }
    public static int[] solution(int numer1,int denom1, int numer2, int denom2){
        int[] answer = new int[2];
        int numer = numer1 * denom2 + numer2*denom1;
        int denom = denom1 * denom2;

        int tmp=1;
        for(int i=1; i<=numer && i<=denom;i++){
            if(numer%i==0 && denom%i==0){
                tmp =i;
            }
        }
        answer[0]=numer/tmp;
        answer[1]=denom/tmp;
        return answer;
    }
}
