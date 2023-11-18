package codingbasictraining.day8;

public class 나머지9로나눈 {
    public static void main(String[] args) {
        String number1 = "123";
        String number2 = "78720646226947352489";
        System.out.println(solution(number1));
        System.out.println(solution(number2));
    }
    private static int solution(String number){
        int sum=0;
        for(int i=0;i<number.length();i++){
            sum+=number.charAt(i)-'0';
        }
        return sum%9;
    }
}
