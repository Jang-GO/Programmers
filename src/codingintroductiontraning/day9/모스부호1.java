package codingintroductiontraning.day9;

public class 모스부호1 {
    private static final String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
        System.out.println(solution(".--. -.-- - .... --- -."));
    }
    private static String solution(String letter){
        String answer="";
        String[] arr = letter.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<morse.length;j++){
                if(arr[i].equals(morse[j])) answer+=Character.toString(j+'a');
            }
        }
        return answer;
    }
}
