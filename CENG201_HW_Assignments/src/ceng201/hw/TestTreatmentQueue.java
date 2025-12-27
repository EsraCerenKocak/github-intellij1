package ceng201.hw;

import java.util.Queue;

public class TestTreatmentQueue {
    public static void main(String[]args){
        TreatmentQueue queue=new TreatmentQueue();//I created first queue object
        //I add variables in the queue
        queue.enQueue(new TreatmentRequest(1,false));
        queue.enQueue(new TreatmentRequest(2,false));
        queue.enQueue(new TreatmentRequest(3,false));
        queue.enQueue(new TreatmentRequest(4,false));
        queue.enQueue(new TreatmentRequest(5,false));
        queue.enQueue(new TreatmentRequest(6,false));
        queue.enQueue(new TreatmentRequest(7,false));
        queue.enQueue(new TreatmentRequest(8,false));
        //I remove variables in the queue
        TreatmentRequest request= queue.deQueue();
        if(request.patientId!=1){
            System.out.println("Test failed"+request.patientId);
            return;
        }
        request= queue.deQueue();
        if(request.patientId!=2){
            System.out.println("Test failded"+request.patientId);
            return;
        }
        request=queue.deQueue();
        if(request.patientId!=3){
            System.out.println("test failed:"+request.patientId);
            return;
        }
        System.out.println("all test is succesful");

        //print
        queue.printQueue();
    }
}
