package org.example;

import java.util.Arrays;

public class DescendingOder {
    public String descendingOder(String str){
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        DescendingOder rs = new DescendingOder();
        System.out.println( rs.descendingOder("Zbcdefg") );
    }
}
