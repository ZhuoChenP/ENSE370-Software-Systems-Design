public class SwordDecorator extends KnightDecorator {

    public SwordDecorator(AbstractKnight newAb){
        super(newAb);
    }
    public void getAttackDescription(){
        knight.getAttackDescription();
        System.out.print("Sword. ");
    }
    public int getAttackDamage(){
        return knight.getAttackDamage()+10;
    }
    
}
