import java.util.Scanner;

public class harfnotuuygulaması {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number= scanner.nextInt();
        String harfnotu ;
        if(number>=90&&number<=100){
           harfnotu= "AA";


        }else if(number>=80&& number<=90){
            harfnotu="BB";
        }else if(number>=70 && number<=80) {
            harfnotu = "CC";
        }else if(number>=60 && number<=70){
            harfnotu="DD";
        }else{
            harfnotu="ff";
        }
        if(number>=0 && number<=100){
            System.out.println("harf notunuz:"+harfnotu);
        }
        else{
            System.out.println("geçersiz"+harfnotu);
        }
    }
}
