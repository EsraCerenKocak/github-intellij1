public class IntHashTable {
    static class Node {
        int id;
        String name;
        double grade;
        Node next;

        Node(int id,String name,double grade){
            this.grade=grade;
            this.name=name;
            this.id=id;
            this.next=null;
        }}
        private Node table[];
        public IntHashTable(int tableSize) {
            table = new Node[tableSize];
        }
        private int hash(int id){
            return Math.abs(id)%table.length;
    }
    public void  set(){

    }
}
