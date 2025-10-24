public class Sınıflar {
    public static void main(String[]args){
        Araba araba =new Araba();
        araba.marka="bmw";
        araba.model="740i";
        araba.renk="gri";
        araba.yıl=2013;

        araba.bilgilerigöster();

    }
}
class Araba{
   String renk;
   String model;
   String marka;
   int yıl;
   void bilgilerigöster(){
       System.out.println("Araba markası:"+marka+"Arabanın rengi:"+renk+"arabanın yılı:"+yıl+"arabanın modeli:"+model);

   }

}
