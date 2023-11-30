package codingbasictraining.day16;

public class A강조하기 {
    public static void main(String[] args) {
        System.out.println(solution("abstract algebra"));
        System.out.println(solution("PrOgRaMmErS"));
    }
    private static String solution(String myString){
        myString=myString.toLowerCase();
        myString=myString.replaceAll("a","A");
        return myString;
    }
}
