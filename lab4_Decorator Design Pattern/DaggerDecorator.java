public class DaggerDecorator extends KnightDecorator {
    public DaggerDecorator(AbstractKnight newAb){
        super(newAb);
    }
    public void getAttackDescription(){
        knight.getAttackDescription();
        System.out.print("Dagger. ");
    }
    public int getAttackDamage(){
        return knight.getAttackDamage()+8;
    }
}
