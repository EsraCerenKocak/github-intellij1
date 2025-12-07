package ceng201.hw;

public class TreatmentQueue {
    private class Node{ //To set up a Linked List-based queue,I need an inner node structure
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
    void enQueue(TreatmentRequest request){
        Node variable=new Node(request);

            if(front==null) {
                front = variable;
                rear = variable;
                currentsize++;
                return;
            }
            System.out.println("first variable added in the queue");




        }
        public TreatmentRequest deQueue() {
            if (front == null) {//If queue is empty then return null
                System.out.println("queue is empty ");
                return null;
            }

            TreatmentRequest temp = front.request;
            front = front.next;//I moved the front to the next node


            //If front becomes null,If the queue is completely emptied
            if (front == null) {
                rear = null;
            }
            currentsize--;
            return temp;
        }
        public int size(){//to return the current number of variables
        return currentsize;

        }
        void printQueue(){//
        Node temp=front;
        while(temp!=null){//Traverse the linked list staring from the front of the queue
            //print the treatment request stored in the temp node
            System.out.println("Patient ID:"+temp.request.patientId+",Arrival Time:"+temp.request.arrivalTime);
            temp=temp.next;
        }
    }
}




