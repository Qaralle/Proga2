import ru.ifmo.se.pokemon.*;
import laba1.pokemons.*;
import laba1.moves.*;
public class Main {


    public static void main(String[] args) {
        Battle vov = new Battle();
        vov.addAlly(new Dragonair("lol",2));
        vov.addFoe(new Registeel("kek",2));
        vov.go();

    }

}