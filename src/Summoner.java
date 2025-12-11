public class Summoner {
    private final String name;
    private int level;

    public Summoner(String name){
        this.name = name; //할당된 즉시 불변
        level = 1;
    }

    public String getName(){
        return name;
    }
}