package codingintroductiontraning.day5;

public class 옷가게할인받기 {
    public static void main(String[] args) {
        int price1 = 150_000;
        int price2 = 580_000;

        System.out.println(solution(price1));
        System.out.println(solution(price2));
    }

    private static int solution(int price) {
        if(price>=500_000){
            return (int)(price*0.8);
        }else if(price>=300_000){
            return (int)(price*0.9);
        }else if(price>=100_000){
            return (int)(price*0.95);
        }else{
            return price;
        }
    }
}
