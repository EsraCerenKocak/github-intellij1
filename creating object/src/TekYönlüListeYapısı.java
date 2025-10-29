public class TekYönlüListeYapısı {
    Node head = null;
    Node tail= null;

    void basaEkle(int x)
    {
        Node eleman = new Node();
        eleman.data=x;
        if(head==null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste yapısı oluştutuldu,ilk eleman eklendi");

        }
        else{
           eleman.next=head;
           head=eleman;
            System.out.println("başa elaman eklendi");

        }

            }
    }




