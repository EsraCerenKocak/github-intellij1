package ceng201.hw;



public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    public TreatmentRequest(int patienId){
        this.patientId=patientId;
        this.arrivalTime= System.currentTimeMillis();

    }
}
