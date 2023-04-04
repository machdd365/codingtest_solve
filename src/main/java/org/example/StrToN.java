package org.example;

public class StrToN {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i< s.length(); i++){
            int stoN = Integer.parseInt (s);
            answer = stoN;
        }
        return answer;
    }
}
