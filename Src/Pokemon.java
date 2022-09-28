package Src;

public abstract class Pokemon{

    //class variable
        private String name;
        private int level;
        private int hp;
        private String type;
        private String food;
        private String sound;

        //constructor
        public Pokemon (String name, int level, int hp, String type,String food,String sound) {
            this.name = name;
            this.level = level;
            this.hp = hp;
            this.type = type;
            this.food = food;
            this.sound = sound;
        }

    public Pokemon() {
    }

    //methodes ->getters& setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getEats() {
        return food;
    }
    public void setEats(String eats) {
        this.food = eats;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    public abstract void eats (String food);
    public abstract void speaks(String sound);
}
