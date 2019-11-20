package laba1.pokemons;
import laba1.moves.*;
import ru.ifmo.se.pokemon.*;

public class Dratini extends Pokemon {
    public Dratini(String name, int level){
        super(name,level);
        setStats(41,64,45,50,50,50);
        setType(Type.DRAGON);
        setMove(new Swagger(), new Facede());
    }
}
