package codingintroductiontraning.day23;

public class 옹알이1 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }

    private static int solution(String[] babbling){
        String[] ma = {"aya", "woo", "ye", "ma"};
        int cnt=0;
        for(String baba:babbling){
            for(int i=0;i<ma.length;i++){
                baba = baba.replace(ma[i]," ");

            }
            baba = baba.replace(" ","");
            if(baba==""){
                cnt++;
            }
        }
        return cnt;
    }

}
