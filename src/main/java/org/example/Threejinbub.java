import java.util.*;

class Threejinbub {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        while(n != 0) {
            if(n%3 == 0) {
                list.add(0);
            } else if(n%3 == 1) {
                list.add(1);
            } else if(n%3 == 2) {
                list.add(2);
            }
            n /= 3;
        }

        int x = 1;
        for(int i=list.size()-1; i>=0; i--) {
            answer += list.get(i)*x;
            x *= 3;
        }

        return answer;
    }
}