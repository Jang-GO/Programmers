package codingintroductiontraning.day11;

public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
    }
    private static int solution(int n) {
        int answer=0;
        int i=1;
        while(n>=fact(i)){
            answer=i;
            i++;
        }
        return answer;
    }
    public static int fact(int a){
        if(a==1) return 1;
        else return a * fact(a-1);
    }
}
