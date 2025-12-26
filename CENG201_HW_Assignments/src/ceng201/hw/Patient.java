package ceng201.hw;
//ı defined variables
public class Patient{
        int id;
        String name;
        int severity;
        int age;
        //ı created constructor
        public Patient(int id,String name,int severity,int age) {
            this.id = id;
            this.name = name;
            this.severity = severity;
            this.age = age;
        }

            public String toString(){
            return "Patient ID:"+id+",Patient's name:"+name+",Severity:"+severity+",Age:"+age;

            }
        }


