package capgemini.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class ReverserFirstKElements {

    static Queue<Integer> reverseFirstK(Queue<Integer> q, int k){

        solve(q, k); // output of solve function: 60,70,80,90,100,50,40,30,20,10

        //Now poll items from start and add at the last
        //out out of while: 50,40,30,20,10,60,70,80,90,100
        while( k-- > 0){
            int x = q.poll();
            q.add(x);
        }
        return q;
    }

    static void solve(Queue<Integer> q, int k){
        if(k == 0)
            return;
        //poll the elements recursively and after polling start adding in the queue
        int e = q.poll();
        solve(q, k - 1);
        //60,70,80,90,100,50,40,30,20,10
        q.add(e);
    }


    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        int k = 5;
        //System.out.println(queue.peek()); //will return 10
        queue = reverseFirstK(queue, k);
        System.out.println(queue);
    }

}
