package org.example;

public class MarathonLoser {
    public static void main(String[] args){
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(marathonLoser(participant, completion));
    }

    public static String marathonLoser(String[] participant,String[] completion){
        int i = 0;

        for (int j=0; j< completion.length; j++){
            if(participant[i].equals(completion[j])){
                completion[j] = "0";
                i++;
            }
        }

        for (int j=0; j< participant.length; j++){
            if (!(participant[j].equals("0"))){
                return participant[j];
            }
        }

        return "그럴리가 없어";
    }
}
