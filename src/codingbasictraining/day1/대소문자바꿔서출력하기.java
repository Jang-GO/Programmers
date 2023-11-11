package codingbasictraining.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 대소문자바꿔서출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] tmp = str.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (char ss: tmp) {
            if(Character.isLowerCase(ss)){
                ss = Character.toUpperCase(ss);
            }else{
                ss = Character.toLowerCase(ss);
            }
            answer.append(ss);
        }

        System.out.println(answer);

    }
}
