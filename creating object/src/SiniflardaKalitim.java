public class SiniflardaKalitim {
    public static void main(String[]args){
        Hayvan hayvan=new Hayvan("Genel hayvan özellikleri");
        hayvan.sesCıkar();
        Kedi kedi=new Kedi("mırmır");
        kedi.sesCıkar();
        Köpek köpek=new Köpek("boncuk");
        köpek.sesCıkar();
    }

}
class Hayvan{
    String isim;

    public Hayvan(String isim){
        this.isim=isim;


    }
    public void sesCıkar(){
        System.out.println("hayvan ses çıkarıyor");
    }

}
class Kedi extends Hayvan{
    public Kedi(String isim){
        super(isim);
    }
    @Override
    public void sesCıkar(){
        System.out.println(isim+"miyavlıyor");
    }
}
class Köpek extends Hayvan{
    public Köpek(String isim){
        super(isim);

    }
    @Override
    public void sesCıkar(){
        System.out.println(isim+"havlıyor");
    }

}