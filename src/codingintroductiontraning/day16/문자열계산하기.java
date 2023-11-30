package codingintroductiontraning.day16;

public class 문자열계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
    }
    private static int solution(String my_string){
        int answer=0;
        String[] tmp = my_string.split(" ");
        answer+=Integer.parseInt(tmp[0]);
        for(int i=1;i<tmp.length-1;i++){
            if(tmp[i].equals("+")){
                answer+=Integer.parseInt(tmp[i+1]);
            }
            if(tmp[i].equals("-")){
                answer-=Integer.parseInt(tmp[i+1]);
            }
        }
        return answer;
    }
}
