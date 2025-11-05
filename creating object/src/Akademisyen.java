public class Akademisyen extends Çalışan {
    String bölümler,görevler;
    String ders;
    public Akademisyen(String adSoyad,String eposta,String telefon,String bölümler,String görevler,String ders){
        super(adSoyad,eposta,telefon);
        this.bölümler=bölümler;
        this.görevler=görevler;
        this.ders=ders;

    }
    public void derseGir(){
        System.out.println("Derse girildi");
    }

}
