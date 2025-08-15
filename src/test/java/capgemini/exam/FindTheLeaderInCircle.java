package capgemini.exam;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/
//https://leetcode.com/problems/find-the-winner-of-the-circular-game/
public class FindTheLeaderInCircle {

    public static void main(String args[]) {

        int n=100;
        int k=3;

        List<Integer> players = new ArrayList<>();
        for(int i =1; i<=n; i++) {
            players.add(i);
        }

        findWinner(players, k-1, 0);

        System.out.println(players.get(0));
    }

    private static void findWinner(List<Integer> players, int k, int index) {

        if(players.size() == 1) {
            return;
        }

        index = (index + k) %  players.size();

        players.remove(index);

        findWinner(players, k, index);


    }
}
