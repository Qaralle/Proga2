package laba1.moves;

import ru.ifmo.se.pokemon.*;

public class StunSpore extends StatusMove {
    public StunSpore() {
        super(Type.GRASS, 0, 75);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        if  (p.hasType(Type.ELECTRIC) == false ){
            Effect.paralyze(p);
        }
    }
}