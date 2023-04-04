package org.example;

public class CenterWord {
    public String solution(String s) {
        String answer = "";
        int a,b = 0;
        String c,d;
        if(s.length()%2==1){
            a = s.length()/2;
            answer = Character.toString(s.charAt(a));
        }
        else{
            a = s.length()/2;
            c = Character.toString(s.charAt(a));
            b = s.length()/2-1;
            d = Character.toString(s.charAt(b));
            answer = d+c;
        }
        return answer;
    }
}
