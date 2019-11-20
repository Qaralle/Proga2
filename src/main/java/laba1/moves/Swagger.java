package laba1.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends SpecialMove {
    public Swagger() {
        super(Type.NORMAL, 0, 75);
    }
    @Override
    public void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.setMod(Stat.ATTACK,+2);
    }
}
