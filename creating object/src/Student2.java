public class Student2 {
    String name;
    int age;
    boolean isJunior;
    char gender;
    public Student2(){
        this.name="";
        this.age=0;
        this.isJunior=false;
        this.gender='m';
    }
    public void info(){
        System.out.println("Student:"+name+"age:"+age+"gender:"+gender+"isJunior"+isJunior);


    }
}
