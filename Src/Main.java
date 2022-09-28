package Src;

public class Main {
    //main method in mijn main class maken!
    //short cut just type main to have line below
    //int is without "" string is with "eats " (bijvoorbeeld)
    //initialialiseren in main

    public static void main(String[] args) {
//        ElectricPokemon Picka = new ElectricPokemon("fireup",1,3,"fire","fireballs","vuuuuw","kaaaboemmmm","flash flash");
//        Picka.eats(" fireballs");
////        Picka.getLevel("+1");
////        Picka.setLightup(Picka.getElectricity());

        WaterPokemon Chocin = new WaterPokemon ("Chocin", 5, "40", "water", "fish", "brieeey");
        System.out.println( Chocin.eats());


        Chocin.setSwim(Chocin.isSwim());
        Chocin.speaks("brieeeuj");

    }
}


