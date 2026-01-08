package ceng201.hw;

import java.util.ArrayList;

import java.util.HashMap;



public class HospitalSystem {
    //I define it
    public PatientList patientList;
    public TreatmentQueue priorityQueue;
    public TreatmentQueue normalQueue;
    public DischargeStack dischargeStack;
    public HashMap<Integer,Patient>patientMap;

    //I created constructor
public HospitalSystem(){
    this.patientList=new PatientList();
    this.priorityQueue=new TreatmentQueue();
    this.normalQueue=new TreatmentQueue();
    this.dischargeStack=new DischargeStack();
    this.patientMap=new HashMap<>();
}
//I created add method for adding patient
    public void addPatient(Patient p){
    patientList.addPatient(p);
    patientMap.put(p.id,p);
    }
    //adds treatment request
    public void addTreatmentRequest(TreatmentRequest request){
    if(request.isPriority){
        priorityQueue.enQueue(request);
    }else{
        normalQueue.enQueue(request);
    }
}
    public Patient processTreatment(){
        TreatmentRequest request;
        if(priorityQueue.size()>0){
            request=priorityQueue.deQueue();

        }else if(normalQueue.size()>0){
            request=normalQueue.deQueue();
        }
        else{
            return null;//no patients
        }
        DischargeRecord dischargeRecord=new DischargeRecord(request.patientId);
        dischargeStack.push(dischargeRecord);
        return patientMap.get(request.patientId);
        }
        public void addDischargeRecord(DischargeRecord record)   {
        dischargeStack.push(record);

        }
        public void printSystemState(){
            System.out.println("Current patients in system:");
            patientList.printList();

            System.out.println("Priority Treatment Queue");
            priorityQueue.printQueue();

            System.out.println("normal treatment queue:");
            normalQueue.printQueue();

            System.out.println("Discharge Records:");
            dischargeStack.printStack();

        }
        public void printPatientsSortedBySeverity() {
            ArrayList<Patient> patientListForSorting = new ArrayList<>(patientMap.values());

            mergeSortBySeverity(patientListForSorting, 0, patientListForSorting.size() - 1);

            System.out.println("Patients sorted by severity(highest first):");
            for (Patient p : patientListForSorting) {
                System.out.println(p);
            }}
            private void mergeSortBySeverity (ArrayList < Patient > list,int left, int right){
                if (left < right) {
                    int mid = (left + right) / 2;

                  //recursivly sort first and second halves
                    mergeSortBySeverity(list, left, mid);
                    mergeSortBySeverity(list, mid + 1, right);
                    merge(list, left, mid, right);
                }
            }
        private void merge(ArrayList<Patient>list,int left,int mid,int right){
                int leftSize=mid-left+1;
                int rightSize=right-mid;
                ArrayList<Patient>leftList=new ArrayList<>();
                ArrayList<Patient>rightList=new ArrayList<>();
               //copy data to temp lists
                for (int idx=0; idx<leftSize; idx++){
                    leftList.add(list.get(left+idx));
                }
                for(int idx =0; idx<rightSize; idx++){
                    rightList.add(list.get(mid+1+idx));
                }
                int leftIndex=0,rightIndex=0;
                int mergedIndex=left;
                while(leftIndex<leftSize && rightIndex< rightSize){
                    //ıf left patient's severity is greater than or equal to right patients severity
                    if(leftList.get(leftIndex).severity>=rightList.get(rightIndex).severity ){
                        list.set(mergedIndex,leftList.get(leftIndex));
                        leftIndex++;
                    }else{
                        list.set(mergedIndex,rightList.get(rightIndex));
                        rightIndex++;
                    }
                    mergedIndex++;
                }//copy remanining variable of leftlist
                while(leftIndex < leftSize){
                list.set(mergedIndex,leftList.get(leftIndex));
                leftIndex++;
                mergedIndex++;
                }//Also copy remaining variable of rightlist 
                while(rightIndex<rightSize){
                    list.set(mergedIndex,rightList.get(rightIndex));
                    rightIndex++;
                    mergedIndex++;
                }
            }
    }


