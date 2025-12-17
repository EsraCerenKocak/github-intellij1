public class Room {
   private String name;
   private int height;
   private double sizeM2;
    Room(String name,int height,double size2M){
        this.name=name;
        this.height=height;
        this.sizeM2=size2M;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getSizeM2() {
        return sizeM2;
    }

    public void setSizeM2(double sizeM2) {
        this.sizeM2 = sizeM2;
    }
}
