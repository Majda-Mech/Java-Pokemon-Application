package Src;

public class ElectricPokemon extends Pokemon {

    // class variable
    private String electricity;
    private String lightup;

    // constructor
    public ElectricPokemon(String name, int level, int hp, String type, String food, String sound, String electricity, String lightup) {
        super(name, level, hp, type, food, sound);
        this.electricity = electricity;
        this.lightup = lightup;
    }

    // getters & setters
    public String getElectricity() {
        return electricity;
    }
    public void setElectricity(String electricity) {
        this.electricity = electricity;
    }
    public String getLightup() {
        return lightup;
    }
    public void setLightup(String lightup) {
        this.lightup = lightup;
    }

//    ikhaat git
    @Override
    public void eats(String food) {
        System.out.println("nom nom nom" + food);
    }
    @Override
    public void speaks(String sound) {

    }
}
