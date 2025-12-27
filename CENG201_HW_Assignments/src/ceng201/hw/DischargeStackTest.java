package ceng201.hw;

public class DischargeStackTest {
    public static void main(String[]args){
        DischargeStack stack=new DischargeStack();
        //I added variable(push test)
        System.out.println("pushing discharge records ");
        stack.push(new DischargeRecord(1));
        stack.push(new DischargeRecord(2));
        stack.push(new DischargeRecord(3));
        stack.push(new DischargeRecord(4));
        stack.push(new DischargeRecord(5));
        System.out.println("all records pushed");
        //(pop test)I removed variable
        DischargeRecord record=stack.pop();
        if(record.patientId!=5){
            System.out.println("test failed"+record.patientId);
            return;
        }
        else{
            System.out.println("popped record for patient ID:"+record.patientId);
        }
        record=stack.pop();
        if(record.patientId!=4){
            System.out.println("test failed"+record.patientId);
            return;
        }
        else{
            System.out.println("popped record for patient Id"+record.patientId);
        }
        System.out.println("all tests is succesfull");
        //print
        stack.printStack();

    }
}
