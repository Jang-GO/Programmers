package codingbasictraining.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 홀짝구분하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println((a%2==0)?a+" is even":a+" is odd");
    }
}
