package laba1.moves;
import ru.ifmo.se.pokemon.*;

public class HammerArm extends PhysicalMove {
    public HammerArm(){
        super(Type.FIGHTING,100,90);
    }
    @Override
    public void applySelfEffects (Pokemon p){
        p.setMod(Stat.SPEED,-1);
    }
}
