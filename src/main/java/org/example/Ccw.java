package org.example;

import java.util.Scanner;

public class Ccw { // 현재 출력이 1로만 되는 문제가 있는 풀이입니다. 미완
    public static void main(String[] args){
        double[] cordinate = new double[6];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<6 ;i++){
            cordinate[i] = sc.nextInt();
        }

        Ccw ccw = new Ccw();

        System.out.println(ccw(cordinate));
    }

    public static int ccw(double[] cordinate){
        double[] vector1 = {cordinate[2]-cordinate[0],cordinate[3]-cordinate[1]};
        double[] vector2 = {cordinate[4]-cordinate[2],cordinate[5]-cordinate[3]};

        double a;

        a = (vector1[0]*vector2[0]+vector1[1]*vector2[1])/(Math.sqrt(vector1[0]*vector1[0]+vector1[1]*vector1[1])*Math.sqrt(vector2[0]*vector2[0]+vector2[1]*vector2[1]));
        System.out.println(a);
        a = Math.acos(a);
        System.out.println(a);
        int answer;
        if(a>0){
            answer = 1;
        }else if(a==0){
            answer = 0;
        } else if (a<0) {
            answer = -1;
        }else {
            answer = 10;
            System.out.println("ERROR");
        }

        return answer;
    }
}
