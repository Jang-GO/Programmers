package codingintroductiontraning.day7;

import org.w3c.dom.ls.LSOutput;

public class 각도기 {
    public static void main(String[] args) {
        System.out.println(solution(70));
        System.out.println(solution(91));
        System.out.println(solution(180));
    }
    private static int solution(int angle){
        if (0<angle && 90>angle){
            return 1;
        }
        else if(angle==90){
            return 2;
        }
        else if(90<angle && 180>angle){
            return 3;
        }
        else{
            return 4;
        }
    }
}
