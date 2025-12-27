package ceng201.hw;

public class DischargeRecord {
   public int patientId;
   public long dischargeTime;
//Initialize discharge record with patient ID and current time
    public DischargeRecord(int patientId){
        this.patientId=patientId;
        this.dischargeTime=System.currentTimeMillis();

    }
}
