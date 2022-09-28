package Src;

public class FirePokemon extends Pokemon {

    //class variable
    private String fireUp;
    private String strong;

    //constructor
    public FirePokemon(String name, int level, int hp, String type, String food, String sound, String fireUp,String strong) {
        super(name, level, hp, type, food, sound);
        this.fireUp = fireUp;
        this.strong = strong;
    }
    //getters & setters
    public String getFireUp() {
        return fireUp;
    }
    public void setFireUp(String fireUp) {
        this.fireUp = fireUp;
    }
    public String getStrong() {
        return strong;
    }
    public void setStrong(String strong) {
        this.strong = strong;
    }

    @Override
    public void eats(String food) {
    }
    @Override
    public void speaks(String sound) {

    }
}
