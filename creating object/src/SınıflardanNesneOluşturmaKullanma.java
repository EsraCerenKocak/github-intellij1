public class SınıflardanNesneOluşturmaKullanma {
    public static void main(String[]args){
        Ogrenci ogrenci=new Ogrenci("esra","koçak",27);
        ogrenci.ogrenciBilgileriniGoster();
    }
}
class Ogrenci{
    String name;
    String surname;
    int number;

    Ogrenci(String name,String surname,int number){
        this.name=name;
        this.surname=surname;
        this.number=number;
    }
    void ogrenciBilgileriniGoster(){
        System.out.println("öğrenci adı:"+name+"öğrenci soyadı:"+surname+"öğrenci numarası:"+number);
    }
}
