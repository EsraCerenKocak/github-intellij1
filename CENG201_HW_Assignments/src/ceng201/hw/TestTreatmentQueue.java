package ceng201.hw;

import java.util.Queue;

public class TestTreatmentQueue {
    public static void main(String[]args){
        TreatmentQueue q=new TreatmentQueue();//I created first queue object
        //I add variables in the queue
        q.enQueue(new TreatmentRequest(1,false));
        q.enQueue(new TreatmentRequest(2,false));
        q.enQueue(new TreatmentRequest(3,false));
        q.enQueue(new TreatmentRequest(4,false));
        q.enQueue(new TreatmentRequest(5,false));
        q.enQueue(new TreatmentRequest(6,false));
        q.enQueue(new TreatmentRequest(7,false));
        q.enQueue(new TreatmentRequest(8,false));
        //I remove variables in the queue
        TreatmentRequest request= q.deQueue();
        if(request.patientId!=1){
            System.out.println("Test failed"+request.patientId);
            return;
        }
        request= q.deQueue();
        if(request.patientId!=2){
            System.out.println("Test failded"+request.patientId);
            return;
        }
        request=q.deQueue();
        if(request.patientId!=3){
            System.out.println("test failed:"+request.patientId);
            return;
        }
        System.out.println("all test is succesful");

        //print
        q.printQueue();
    }
}
