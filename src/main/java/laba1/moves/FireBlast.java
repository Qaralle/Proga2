package laba1.moves;
import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove{
    public FireBlast(){
        super(Type.FIRE,110,85);

    }
    @Override
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.burn(p) ;
        }
    }
}
