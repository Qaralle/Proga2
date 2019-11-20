package laba1.moves;
import ru.ifmo.se.pokemon.*;

public class Facede extends PhysicalMove{
    public Facede(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    public void applyOppDamage(Pokemon p, double damage){
        Status PokCon = p.getCondition();
        if (PokCon.equals(Status.BURN) || PokCon.equals(Status.POISON) || PokCon.equals(Status.PARALYZE)) {
            p.setMod(Stat.HP, -2*(int)Math.round(damage));
        }
    }
}
