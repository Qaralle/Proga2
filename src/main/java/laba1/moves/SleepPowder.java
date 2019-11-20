package laba1.moves;

import ru.ifmo.se.pokemon.*;

public class SleepPowder extends StatusMove {
    public  SleepPowder(){
        super(Type.GRASS,0 ,75);
    }
    @Override
    public void applyOppEffects(Pokemon p) {
        Effect.sleep(p);
    }
}
