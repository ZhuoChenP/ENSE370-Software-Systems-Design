
abstract class KnightDecorator implements AbstractKnight {
    protected AbstractKnight knight;
    public KnightDecorator(AbstractKnight knight)
    {
        this.knight=knight;
    }
    public abstract void getAttackDescription();
    public abstract int getAttackDamage();
}
