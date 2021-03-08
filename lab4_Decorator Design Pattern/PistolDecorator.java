public class PistolDecorator extends KnightDecorator {
    public PistolDecorator(AbstractKnight newAb){
        super(newAb);
    }
    public void getAttackDescription(){
        knight.getAttackDescription();
        System.out.print("Pistol. ");
    }
    public int getAttackDamage(){
        return knight.getAttackDamage()+15;
    }
}
