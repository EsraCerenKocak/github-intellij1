package ceng201.hw;

public class PatientListTest {
    public static void main(String[]args){
        PatientList list=new PatientList();
        //add patients
        System.out.println("*** adding patients ***" );
        list.addPatient(new Patient(1,"Özlem",4,42));
        list.addPatient(new Patient(2,"Yılmaz",5,49));
        list.addPatient(new Patient(3,"Duru",6,10));
        list.addPatient(new Patient(4,"Esra",3,21));
        list.addPatient(new Patient(5,"Tülin",5,54));
        //remove patient
        list.removePatient(3);
        //print the list
        System.out.println("final list:");
        list.printList();
    }
}
