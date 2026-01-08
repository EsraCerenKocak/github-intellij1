package ceng201.hw;

public class DischargeStack {
    //** I creat a node class
    private class Node{
        DischargeRecord record;
        Node next;
        Node (DischargeRecord record){
            this.record=record;
            this.next=null;
        }
    }
    private Node top;

   public void push(DischargeRecord record){
        Node variable=new Node(record);
        variable.next=top;
        top=variable;
       System.out.println("patient:"+record.patientId+"added");
        }
        public DischargeRecord pop() {
            //ıf the top is null,return null
            if (top == null)
            return null;
        //pop the top record
        DischargeRecord record=top.record;
        top=top.next;
        return record;
    }
    public DischargeRecord peek(){
            return top==null?null:top.record;


    }
    public void printStack(){
    Node temp=top;
    while(temp!=null){
        System.out.println("Patient ID:"+temp.record.patientId+",Discharge Time"+temp.record.dischargeTime);
        temp=temp.next;
    }
    }
}
