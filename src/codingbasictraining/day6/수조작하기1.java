package codingbasictraining.day6;

public class 수조작하기1 {
    public static void main(String[] args) {
        int n=0;
        String control = "wsdawsdassw";
        System.out.println(solution(n,control));
    }

    private static int solution(int n, String control) {
        int sum=n;
        for(int i=0;i<control.length();i++){
            if(control.charAt(i)=='w') sum+=1;
            else if(control.charAt(i)=='s') sum-=1;
            else if(control.charAt(i)=='d') sum+=10;
            else sum-=10;
        }
        return sum;
    }
}
