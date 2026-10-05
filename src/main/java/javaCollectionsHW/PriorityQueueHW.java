package javaCollectionsHW;

import java.util.PriorityQueue;

public class PriorityQueueHW {


    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(1);
        pq.add(99);
        pq.add(8);
        pq.add(3);
        pq.add(87);
        pq.add(2);
        pq.add(5);

        while(!pq.isEmpty())
            System.out.println("Processing queue: " + pq.poll());
        }
    }
