public class StudentTest {
    public static void  main(String[]args){
        Student s1= new Student();
        System.out.println(s1.age);
        System.out.println(s1.name);
        s1.age=15;
        s1.name="Ayşe";
        s1.gender='f';
        s1.isJunior=true;
        System.out.println(s1.age);
        System.out.println(s1.name);
        s1.info();


    }
}
