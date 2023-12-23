package codingbasictraining.day24;

public class 커피심부름 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}));
        System.out.println(solution(new String[]{"americanoice", "americano", "iceamericano"}));
    }
    private static int solution(String[] order){
        int sum = 0;
        for(String menu:order){
            if(menu.contains("americano") || menu.contains("anything")){
                sum += 4500;
            }else{
                sum+=5000;
            }
        }
        return sum;
    }
}
