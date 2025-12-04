package ceng201.hw;

public class PatientListTest {
    public static void main(String[]args){
        PatientList list=new PatientList();
        //add patients
        System.out.println("adding patients" );
        list.addPatient(new Patient(1,"Özlem",4,42));
        list.addPatient(new Patient(2,"Yılmaz",5,49));
        list.addPatient(new Patient(3,"Duru",6,10));
        list.addPatient(new Patient(4,"Esra",3,21));
        list.addPatient(new Patient(5,"Tülin",5,54));
        //remove patient
        System.out.println("ID is 3 and this patient remove");
        list.removePatient(3);
        //find patient
        System.out.println("ID is 2 and this patient search");
        Patient p=list.findPatient(2);
        if(p!=null){
            System.out.println("this patient found:"+p.name);
        }
        else{
            System.out.println("this patient not found");
        }
        //print the list
        System.out.println("final list:");
        list.printList();
    }
}
