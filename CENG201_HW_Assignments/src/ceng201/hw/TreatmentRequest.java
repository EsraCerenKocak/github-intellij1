package ceng201.hw;



public class TreatmentRequest {
   public int patientId;
    long arrivalTime;
    boolean isPriority;
    public TreatmentRequest(int patientId){
        this.patientId=patientId;
        this.isPriority=isPriority;
        this.arrivalTime= System.currentTimeMillis();

    }
}
