public class song {
    String title;
    song next;
    song prev;
    public song(String title){
        this.title=title;
        this.next=null;
        this.prev=null;
    }
}
