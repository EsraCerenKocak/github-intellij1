package ceng201.hw;

import java.util.HashMap;

public class HospitalSystem {
    private PatientList patientlist;
    private TreatmentQueue priorityQueue;
    private TreatmentQueue normalQueue;
    private DischargeStack dischargeStack;
    private HashMap<Integer,Patient>patientMap;

    //I created constructor
public HospitalSystem(){
    this.patientlist=new PatientList();
    this.priorityQueue=new TreatmentQueue();
    this.normalQueue=new TreatmentQueue();
    this.dischargeStack=new DischargeStack();
    this.patientMap=new HashMap<>();
}
//I created add method for adding patient
    public void addPatient(Patient p){
    patientlist.addPatient(p);
    patientMap.put(p.id,p);
    }
    //adds treatment request
    public void addTreatmentRequest(TreatmentRequest request){
    if(request.isPriority){
        priorityQueue.enQueue(request);
    }else{
        normalQueue.enQueue(request);
    }
    public Patient processTreatment(){
        TreatmentRequest request;
        if(priorityQueue.size()>0){
            request=priorityQueue.deQueue();

        }else if(normalQueue.size()>0){
            request=normalQueue.deQueue();
        }
        else{
            return null;
        }DischargeRecord dischargeRecord=new DischargeRecord(request.patientId);
        dischargeStack.push(dischargeRecord);
        return patientMap.get(request.patientId);
        }

    }

}
