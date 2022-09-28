package Src;

public class WaterPokemon extends Pokemon {

    // class variable
    private boolean swim;
    private String jumps;

    // constructor
    public WaterPokemon(String name, int level, int hp, String type, String food, String sound, String electricity, String lightup) {
        super(name, level, hp, type, food, sound);
        this.swim = swim;
        this.jumps = jumps;
    }

    public WaterPokemon(String chocin, int level, String s, String water, String fish, String brieeey) {
    }

    // getters & setters
    public boolean isSwim() {
        return swim;
    }
    public void setSwim(boolean swim) {
        this.swim = swim;
    }
    public String getJumps() {
        return jumps;
    }
    public void setJumps(String jumps) {
        this.jumps = jumps;
    }

    @Override
    public void eats(String food) {
    }
    @Override
    public void speaks(String sound) {
    }
}
