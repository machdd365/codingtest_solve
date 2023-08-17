package org.example;

import java.util.Arrays;

public class MarathonLoser {
    public static void main(String[] args){
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(marathonLoser(participant, completion));
    }

//    public static String marathonLoser(String[] participant,String[] completion){
//        int i = 0;
//
//        for (int j=0; j< completion.length; j++){
//            if(participant[j].equals(completion[i])){
//                System.out.println(participant[j]);
//                participant[j] = "0";
//                i++;
//            }
//        }
//        System.out.println(Arrays.toString(participant));
//
//        for (int j=0; j< participant.length; j++){
//            if (!(participant[j].equals("0"))){
//                return participant[j];
//            }
//        }
//
//        return "그럴리가 없어";
//    }

    public static String marathonLoser(String[] participant,String[] completion){
        int j=0;
        for (int i : completion){
            if (participant[j].equals(i)) {
                participant[j] = "0";
            }else {
                j++;
            }
        }
    }
}
