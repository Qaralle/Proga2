package laba1.pokemons;
import ru.ifmo.se.pokemon.*;
import laba1.moves.*;

public class Registeel extends Pokemon {
    public Registeel(String name, int level){
        super(name, level);
        setStats(80,75,150,75,150,50);
        setType(Type.STEEL);
        setMove(new Tackle(), new Rest(), new SleepPowder(), new StunSpore());
    }
}
