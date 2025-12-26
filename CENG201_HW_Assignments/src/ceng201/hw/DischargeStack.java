package ceng201.hw;

public class DischargeStack {
    private Node top;
    //** I creat a node class
    private class Node{
        DischargeRecord r;
        Node next;
        Node (DischargeRecord data){
            this.r=data;

        }
    }

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
        DischargeRecord record=top.r;
        top=top.next;
        return record;
    }
    public DischargeRecord peek(){
            if(top==null){
                System.out.println("the stack is empty");
                return null;
            }
            DischargeRecord first=top.r;
            return first;

    }
    public void printStack(){
        if(top==null){
            System.out.println("the stack is empty");
            return;
        }
        System.out.println("remaining discharge stack");
    Node temp=top;
    while(temp!=null){//traverse so all element printed
        System.out.println("Patient ID:"+temp.r.patientId+",Discharge Time"+temp.r.dischargeTime);
        temp=temp.next;
    }
    }
}
