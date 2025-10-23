public class book {

    String title;
    String author;
    double price;
    public book(){
        title=";" ;
        author="";
        price=0;
    }
    public book(String title,String author,double price){
     this.title=title;
     this.author=author;
     this.price=price;
    }
    public void showDetail(){
        System.out.println(title+""+author+""+price);
    }
}
