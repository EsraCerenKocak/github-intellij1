package ceng201.hw;

public class TestTreatmentQueue {
    public static void main(String[]args){
        TreatmentQueue q=new TreatmentQueue();//I created first queue object
        //I add variables in the queue
        q.enQueue(new TreatmentRequest(1));
        q.enQueue(new TreatmentRequest(2));
        q.enQueue(new TreatmentRequest(3));
        q.enQueue(new TreatmentRequest(4));
        q.enQueue(new TreatmentRequest(5));
        q.enQueue(new TreatmentRequest(6));
        q.enQueue(new TreatmentRequest(7));
        q.enQueue(new TreatmentRequest(8));
        //I remove variables in teh queue

        //print
        q.printQueue();
    }
}
