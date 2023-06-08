package org.example;

public class CaesarCipher {
    public String caesarCipher(String s, int n) {
        //함수를 완성하세요.
        char[] split = s.toCharArray();
        for (int i = 0; i < split.length; i++) {
            if (split[i] >= 'A'  && split[i] <=  'Z') {
                split[i] += n % 26;
                if(!(split[i] >= 'A'  && split[i] <= 'Z')){
                    split[i] -= 26;
                }
            }else if(split[i] >= 'a'  && split[i] <= 'z'){
                split[i] += n % 26;
                if(!(split[i] >= 'a'  && split[i] <= 'z')){
                    split[i] -= 26;
                }
            }
        }
        return new StringBuffer().append(split).toString();
    }

    public static void main(String[] args) {
        CaesarCipher c = new CaesarCipher();
        System.out.println("s는 'a B z', n은 4인 경우: " + c.caesarCipher("a B z", 4));
    }

}
