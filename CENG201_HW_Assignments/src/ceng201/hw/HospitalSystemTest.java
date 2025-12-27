package ceng201.hw;

public class HospitalSystemTest {
    public static void main(String[]args){
        HospitalSystem system=new HospitalSystem();
        //ı created and I add 10 patients
        System.out.println("Adding patients to the system");
        for(int i=0;i<10;i++){
            Patient patient=new Patient(i+1,"patient"+(i+1),i%5+1,20+i);
            system.addPatient(patient);
        }
        System.out.println("All patient added in the system");
        //I create and I added treatment requests(some priority !,some normal)
        system.addTreatmentRequest(new TreatmentRequest(1,false));
        system.addTreatmentRequest(new TreatmentRequest(2,true));
        system.addTreatmentRequest(new TreatmentRequest(3,false));
        system.addTreatmentRequest(new TreatmentRequest(4,false));
        system.addTreatmentRequest(new TreatmentRequest(5,true));
        system.addTreatmentRequest(new TreatmentRequest(6,false));
        system.addTreatmentRequest(new TreatmentRequest(7,true));
        system.addTreatmentRequest(new TreatmentRequest(8,false));
        //Add 2 discharge record to simulate prior discharges
        System.out.println("Adding treatment record to the system");
        system.addDischargeRecord(new DischargeRecord(9,System.currentTimeMillis()));
        system.addDischargeRecord(new DischargeRecord(10,System.currentTimeMillis()));
        System.out.println("all discharges records added");


        //Print İnitial system's state
        system.printSystemState();

        //Process 4 treatments
        for(int i=0;i<4;i++) {
            Patient treatedPatient = system.processTreatment();
            if (treatedPatient !=null){
                System.out.println("Treated patient:ID"+treatedPatient.id+",Name:"+treatedPatient.name);
            }
            else{
                System.out.println("no patient for treatment");
            }
        }
        //Print final system state
        System.out.println("****System State After Processing****");
        system.printSystemState();

    }
}
