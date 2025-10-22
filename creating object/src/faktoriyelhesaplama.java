import java.util.Scanner;

public class faktoriyelhesaplama {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("faktoriyeli hesaplanacak sayı");
        int sayi=scanner.nextInt();
        long faktoriyelhesaplama=1;
        if(sayi<0){
            System.out.println("negatif sayılar için faktoriyel hesaplanamaz");

        }
        else{
            for(int i=1;i<=sayi;i++){
                faktoriyelhesaplama*=i;
            }
            System.out.println(sayi+"!="+faktoriyelhesaplama);
        }

    }
}
