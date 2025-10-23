public class Student {

    String name;
    int age;
    boolean isJunior;
    char gender;
    public Student(){
        age=0;
        gender='m';
        isJunior=false;
        name="";
    }
    public void info(){
        System.out.println( age+" "+ gender+" "+isJunior+" "+ name);
    }

}
