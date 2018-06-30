public class Character {
    public String name;
    public int hp;
    public int lvl;

    public Character(String name, int lvl, int hp) {
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getLvl(){
        return lvl;
    }

    public int getHP(){
        return hp;
    }
    public void setName(String name){
        this.name = name;
    }
}
