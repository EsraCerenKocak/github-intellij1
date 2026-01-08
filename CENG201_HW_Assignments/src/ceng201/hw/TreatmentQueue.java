package ceng201.hw;

public class TreatmentQueue {
    private static class Node{ //To set up a Linked List-based queue,I need an inner node structure
        TreatmentRequest request;
        Node next;
        Node(TreatmentRequest request){//ı created constructor
            this.request=request;
            this.next=null;
        }
    }
    private int currentsize;
    private Node front;
    private Node rear;
    public TreatmentQueue(){
        this.front=null;
        this.rear=null;
        this.currentsize=0;
    }
    //I add variable
    void enQueue(TreatmentRequest request){
        Node variable=new Node(request);
        //ıf the queue is empty,add the new variable as both of front and rear

            if(front==null) {
                front = variable;
                rear = variable;
                System.out.println("added patient:"+request.patientId);
                currentsize++;
            }else {
                variable.next = null;
                rear.next = variable;
                rear = variable;
                currentsize++;
                System.out.println("added patient:" + request.patientId);
            }
        }
        public TreatmentRequest deQueue() {
            if (front == null) {//If queue is empty then return null
                System.out.println("queue is empty ");
                return null;
            }else if(front.next==null){//ıf there is just one patient
                TreatmentRequest temp=front.request;
                front=null;
                rear=null;
                System.out.println("the only patient deleted");
                currentsize--;
                return temp;
            }else{//ıf there are more one variable
                TreatmentRequest temp=front.request;
                front=front.next;
                currentsize--;
                return temp;
            }
        }
        public int size(){//to return the current number of variables
        return currentsize;

        }
        void printQueue(){//
        Node temp;
        temp=front;
        while(temp!=null){//Traverse the linked list staring from the front of the queue
            //print the treatment request stored in the temp node
            System.out.println("Patient ID:"+temp.request.patientId+",Arrival Time:"+temp.request.arrivalTime);
            temp=temp.next;
        }
    }
}




