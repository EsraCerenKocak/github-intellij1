


public class DoublyLinkedPlayList {
    private song head;
    private song tail;
    private song current;
    //şarkı ekleme metodu
    public void addSong(String title){
        song newSong =new song(title);
        if (head==null){
            head=newSong;
            tail=newSong;
            current=newSong;
            System.out.println("ilk şarkı eklendi"+title);
        }else{
           //listenin sonuna ekle
           tail.next=newSong;
           newSong.prev=tail;
           tail=newSong;
            System.out.println("Yeni şarkı eklendi:"+title);
        }

    }//sonraki şarkıya geç
    public void nextSong(){
        if(current==null){
            System.out.println("Çalma listesi boş");
            return;
        }
        if(current.next==null){
            System.out.println("End of playlist");

        }else{
            current=current.next;
            System.out.println("Now playing:"+current.title);
        }
    }//Önceki şarkıya dön
    public void previoussong(){
        if (current.prev==null){
            System.out.println("Start of playlist");
            return;
        }else{
            current=current.prev;
            System.out.println("now playing"+current.title);
        }

    }

}
