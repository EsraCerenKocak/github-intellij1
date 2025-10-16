public class CheckPrime {
    public void CheckPrime (int num ){
        for(int i=2; i<num-1; i++){
            if(num%i==0){
                System.out.println(num + " prime number");
                break ;
            }

        }
    }
}
