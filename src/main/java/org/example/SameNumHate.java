package org.example;

public class SameNumHate {
    public int[] solution(int []arr) {
        int[] answer ;
        int count = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i-1] != arr[i])
                count++;
        }
        answer = new int[count];

        count=1;

        answer[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] != arr[i]){
                answer[count] = arr[i];
                count++;
            }
        }


        return answer;
    }
}
