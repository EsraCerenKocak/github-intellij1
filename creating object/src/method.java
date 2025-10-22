import java.time.LocalTime;
import java.util.Random;

public class method {
    public static void main(String[]args){
        message();
    }
    public static void message(){
        System.out.println("sıfırdan ileri seviyeye javaya hoşgeldinniz");
        randomNumber();
        getHour();
    }
    public static void randomNumber(){
        Random random=new Random();
        int number =random.nextInt(50);
        System.out.println(number);
    }
    public static void getHour(){
        LocalTime now=LocalTime.now();
        System.out.println("Time"+now.getHour());
    }
}
