import java.util.Scanner;
public class TekYönlüListeYapısı {
    Scanner scanner=new Scanner(System.in);
    Node head=null;
    Node tail=null;
    int data;
    void basaEkle(){
        System.out.println("data:");
        data= scanner.nextInt();
        Node eleman=new Node();
        if(head==null){
            head=eleman;
            tail=eleman;
            head.next=tail;
            head.prev=tail;
            tail.next=head;
            tail.prev=head;
        }
        else{
            eleman.next=head;
            head.prev=eleman;
            tail.prev=head;
            tail.next=tail;

        }
    }void sonaEkleme(){
        System.out.println("data:");
        data=scanner.nextInt();
        Node eleman=new Node();
        if(head==null){
            head=eleman;
            tail=eleman;
            head.next=tail;
            head.prev=tail;
            tail.next=head;
            tail.prev=head;
        }else{
            tail.next=eleman;
            tail=eleman;
            head.prev=tail;
            tail.next=head;
        }
    }


    }



































