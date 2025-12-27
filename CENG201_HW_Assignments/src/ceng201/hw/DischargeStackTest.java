package ceng201.hw;

public class DischargeStackTest {
    public static void main(String[]args)throws InterruptedException{
        DischargeStack stack=new DischargeStack();
       DischargeRecord r1=new DischargeRecord(1,System.currentTimeMillis());
       Thread.sleep(5001);
       DischargeRecord r2=new DischargeRecord(2,System.currentTimeMillis());
       Thread.sleep(5001);
       DischargeRecord r3=new DischargeRecord(3,System.currentTimeMillis());
       Thread.sleep(5001);
       DischargeRecord r4=new DischargeRecord(4,System.currentTimeMillis());
       DischargeRecord r5=new DischargeRecord(5,System.currentTimeMillis());


       stack.push(r1);
       stack.push(r2);
       stack.push(r3);
       stack.push(r4);
       stack.push(r5);

       stack.pop();
       stack.pop();

       stack.printStack();

}}
