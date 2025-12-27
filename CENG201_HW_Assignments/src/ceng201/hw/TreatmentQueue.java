package ceng201.hw;

public class TreatmentQueue {
    private Node front;
    private Node rear;
    private int size;

    private class Node{
        TreatmentRequest treatmentRequest;
        Node next;

        Node(TreatmentRequest data){

            this.treatmentRequest=data;
        }
    }
    //I add variable
    void enQueue(TreatmentRequest request){
        Node variable=new Node(request);
        //ıf the queue is empty,add the new variable as both of front and rear

            if(front==null) {
                front = variable;
                rear = variable;
                System.out.println("added patient:"+request.patientId);
                size++;
            }else {
                variable.next = null;
                rear.next = variable;
                rear = variable;
                size++;
                System.out.println("added patient:" + request.patientId);
            }
        }
        public TreatmentRequest deQueue() {
            if (front == null) {//If queue is empty then return null
                System.out.println("queue is empty ");
                return null;
            }else if(front.next==null){//ıf there is just one patient
                TreatmentRequest temp=front.treatmentRequest;
                front=null;
                rear=null;
                System.out.println("the only patient deleted");
                size--;
                return temp;
            }else{//ıf there are more one variable
                TreatmentRequest temp=front.treatmentRequest;
                front=front.next;
                size--;
                return temp;
            }
        }
        public int size(){//to return the current number of variables
        return size;

        }
        void printQueue(){//
        Node temp;
        temp=front;
        while(temp!=null){//Traverse the linked list staring from the front of the queue
            //print the treatment request stored in the temp node
            System.out.println("Patient ID:"+temp.treatmentRequest.patientId+",Arrival Time:"+temp.treatmentRequest.arrivalTime);
            temp=temp.next;
        }
    }
}




