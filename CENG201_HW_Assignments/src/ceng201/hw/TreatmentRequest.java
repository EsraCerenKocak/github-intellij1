package ceng201.hw;

public class TreatmentRequest {
   public int patientId;
    long arrivalTime;
    boolean isPriority;
    public TreatmentRequest(int patientId,boolean isPriority) {//my constructor
        this.patientId = patientId;
        this.isPriority = isPriority;
        this.arrivalTime = System.currentTimeMillis();
    }
    public boolean isPriority(){
        return isPriority;

    }
}
