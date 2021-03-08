public class BowDecorator extends KnightDecorator  {
    public BowDecorator(AbstractKnight newAb){
        super(newAb);
    }
    public void getAttackDescription(){
        knight.getAttackDescription();
        System.out.print("Bow. ");
    }
    public int getAttackDamage(){
        return knight.getAttackDamage()+5;
    }
}
