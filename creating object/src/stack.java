public class stack {
    int dizi[];
    int size;
    int indis;
    public stack(int size){
        this.size=size;
        dizi=new int[size];
        indis =-1;
    }
void push(int data){
        if(isFull()){
            System.out.println("stack dolu");
        }else {
            indis++;
            dizi[indis] = data;
            System.out.println("push():" + dizi[indis]);
        }
}
int pop(){
        if(!isEmpty()){
            return dizi[indis--];
        }else{
            System.out.println("dizi boş");
            return 0;

        }

}
boolean isFull(){
        return (indis ==size-1);
}
boolean isEmpty(){
        return (indis==-1);
}






}
