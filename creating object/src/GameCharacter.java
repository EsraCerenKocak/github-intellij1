import java.util.Random;

public class GameCharacter {
     Random random=new Random();
     private int characterId;



   private int  characterld;
    private String name;
   private int level;
   private  int health;
   private static int totalCharacters=0;



    public  GameCharacter(String name,int health,int level){
        this.name=name;
        this.level=level;
        this.health=health;
        Random rnd=new Random();
        this.characterId=1000+rnd.nextInt(9000);

        totalCharacters++;
    }
    public int getCharacterId(){
        return characterId;

    }
    public String getName(){
        return name;

    }
    public  int getLevel(){
        return level;
    }
    public int getHealth(){
        return health;
    }
    public int getTotalCharacters(){
        return totalCharacters;
    }
    public void takeDamage(int damage){
        health-=damage;
        if(health<0){
            health=0;
        }

    }
    public String  getInfo(){
        return "namee: " + name+"Id:"+
                characterId+"level:"+level+"health"+health+"totalcharacter"+totalCharacters;

    }

}
