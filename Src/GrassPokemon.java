package Src;

import javax.swing.*;

public class GrassPokemon extends Pokemon {

    // class variable
    private String color;
    private String strenght;

    // constructor
    public GrassPokemon(String name, int level, int hp, String type, String food, String sound, String electricity, String lightup) {
        super(name, level, hp, type, food, sound);
        this.color = color;
        this.strenght = strenght;
    }

    // getters & setters

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getStrenght() {
        return strenght;
    }
    public void setStrenght(String strenght) {
        this.strenght = strenght;
    }

    @Override
    public void eats(String food) {
    }

    @Override
    public void speaks(String sound) {
    }
}




