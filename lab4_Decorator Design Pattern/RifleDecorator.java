public class RifleDecorator extends KnightDecorator {
    public RifleDecorator(AbstractKnight newAb){
        super(newAb);
    }
    public void getAttackDescription(){
        knight.getAttackDescription();
        System.out.print("Rifle. ");
    }
    public int getAttackDamage(){
        return knight.getAttackDamage()+20;
    }
}
