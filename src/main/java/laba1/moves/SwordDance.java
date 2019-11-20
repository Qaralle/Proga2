package laba1.moves;
import ru.ifmo.se.pokemon.*;

public class SwordDance extends SpecialMove {
    public SwordDance(){
        super(Type.NORMAL, 0 ,0);
    }
    @Override
    public void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK,+6);
    }
}
