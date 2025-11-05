import java.sql.SQLOutput;

public class makyaj {
public String name , marka;
private int fiyat;
makyaj(String name,int fiyat,String marka) {
    this.name = name;
    this.marka = marka;
    this.fiyat = fiyat;
    if (fiyat < 0) {
        this.fiyat = 000;
        System.out.println("geçersiz fiyat" + 000);
    } else {
        this.fiyat = fiyat;
    }
}
public int getFiyat(){
    return this.fiyat;

}
public void setFiyat(int fiyat){
    this.fiyat= fiyat;

}

    }







