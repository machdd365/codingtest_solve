package org.example;

import java.util.Scanner;

public class Test {
    public void star(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i<b;i++){
            for (int j = 0; j<a;j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

    public String evenOdd(int num){
        return num%2==0 ? "Even":"Odd";
    }

    public String centerWord(String s){
        String answer;
        int a = 0;

        if(s.length()%2==0){
            answer = Character.toString(s.charAt(s.length()/2-1)) + Character.toString(s.charAt(s.length()/2));
        }else {
            answer = Character.toString(s.charAt(s.length()/2));
        }
        return answer;
    }

    public static void main(String[] args){
        Test t = new Test();
//        t.star();
//        System.out.println(t.evenOdd(14));
//        String a = "i";
//        String b = "j";
//        String answer = a+b;
//        System.out.println(answer);
        System.out.println(t.centerWord("abcdef"));
    }
}
