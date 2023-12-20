package codingintroductiontraning.day21;

import java.util.List;

public class 외계어사전 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }
    private static int solution(String[] spell, String[] dic){
        boolean check = false;
        for(String ap:dic){
            int cnt=0;
            for(int i=0;i<spell.length;i++){
                if(ap.contains(spell[i])) cnt++;
            }
            if(cnt== spell.length) check = true;
        }
        return check ? 1  : 2;
    }
}
