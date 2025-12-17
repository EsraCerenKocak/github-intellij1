package ceng201.hw;

public class DischargeStack {
    private class Node{
        DischargeRecord record;
        Node next;
        Node (DischargeRecord record){
            this.record=record;
            this.next=null;
        }
    }
    private Node top;
    public DischargeStack() {
        //I created constructor
        this.top = null;

    }
    void push(DischargeRecord record){
        Node variable=new Node(record);
        variable.next=top;
        top=variable;
        }
        public DischargeRecord pop(){
        if(top==null){
            return null;
        }
        DischargeRecord temp=top.record;
        top=top.next;
        return temp;
    }
    public DischargeRecord peek(){
        if(top==null){
            return null;
        }
        return top.record;
    }
    void printStack(){
    Node temp=top;
    while(temp!=null){
        System.out.println("Patient ID:"+temp.record.patientId+",Discharge Time"+temp.record.dischargeTime);
        temp=temp.next;
    }
    }
}
