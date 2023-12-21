package codingbasictraining.day22;

public class 영떼기 {
    public static void main(String[] args) {
        System.out.println(solution("0010"));
        System.out.println(solution("854020"));
    }
    private static String solution(String n_str){
        String answer="";
        boolean breaked = false;
        int cont = 0;
        // 처음 0으로 시작하는것이 깨지는 것를 기록하는 for문
        if(!breaked) {
            for (int i = 0; i < n_str.length(); i++) {
                if (n_str.charAt(i) !='0'){
                    cont = i;
                    break;
                }
            }
        }
        for(int i=cont; i< n_str.length();i++){
            answer+=n_str.charAt(i);
        }
        return answer;
    }
}
