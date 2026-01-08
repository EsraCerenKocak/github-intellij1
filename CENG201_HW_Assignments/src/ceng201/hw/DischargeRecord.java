package ceng201.hw;

public class DischargeRecord {
    int patientId;
    long dischargeTime;
//Initialize discharge record with patient ID and current time
    public DischargeRecord(int patientId){
        this.patientId=patientId;
        this.dischargeTime=System.currentTimeMillis();

    }
}
