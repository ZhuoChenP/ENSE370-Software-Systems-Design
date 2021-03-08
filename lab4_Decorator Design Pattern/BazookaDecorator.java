public class BazookaDecorator extends KnightDecorator {
    public BazookaDecorator(AbstractKnight newAb){
        super(newAb);
    }
    public void getAttackDescription(){
        knight.getAttackDescription();
        System.out.print("Bazooka. ");
    }
    public int getAttackDamage(){
        return knight.getAttackDamage()+25;
    }
}
