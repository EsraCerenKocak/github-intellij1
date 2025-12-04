package ceng201.hw;

public class Main {
    public static void main(String[]args){
        PatientList list= new PatientList();
        list.addPatient(new Patient(1,"Yılmaz Koçak",4,49));
        list.addPatient(new Patient(2,"Özlem Koçak",5,42));


        //remove patient
        System.out.println("ID is 2 and this patient is remove");
        list.removePatient(2);


        //find patient
        System.out.println("ID is 1 and this patient search");
        Patient p=list.findPatient(1);
        if(p!=null){
            System.out.println("found:"+p.name);
        }
        else{
            System.out.println("not found this patient");
        }
    }
}
