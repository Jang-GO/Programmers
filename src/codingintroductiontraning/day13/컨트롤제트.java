package codingintroductiontraning.day13;

public class 컨트롤제트 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }
    private static int solution(String s){
        String[] tmp = s.split(" ");
        int sum=0;
        for(int i=0;i<tmp.length;i++){
            if(tmp[i].equals("Z")) sum-=Integer.parseInt(tmp[i-1]);
            else sum+=Integer.parseInt(tmp[i]);
        }
        return sum;
    }
}
