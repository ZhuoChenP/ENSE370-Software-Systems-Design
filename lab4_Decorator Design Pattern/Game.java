/*----------------------------------------------------------------------------*\

         ___ _  _ ___ ___   ________ __          _         _      _ _  
        | __| \| | __/ __| |__ /__  /  \   ___  | |   __ _| |__  | | | 
        | _|| .` | _|\__ \  |_ \ / / () | |___| | |__/ _` | '_ \ |_  _|
        |___|_|\_|___|___/ |___//_/ \__/        |____\__,_|_.__/   |_| 
                                                                       
                                   Game.java
                                  Adam Tilson
                                   Feb, 2021

    This application creates a knight equipped with different weapons using
    the Decorator design pattern.
\*----------------------------------------------------------------------------*/

public class Game {

    public static void main (String [] args) {

        int damage;
        AbstractKnight firstKnight = new BowDecorator ( new SwordDecorator ( new Knight()));
        firstKnight.getAttackDescription();
        damage = firstKnight.getAttackDamage();
        System.out.println(" The attack does " + damage + " damage.");
        AbstractKnight secondKnight = new BowDecorator(new DaggerDecorator(new Knight()));
        secondKnight.getAttackDescription();
        damage = secondKnight.getAttackDamage();
        System.out.println(" The attack does " + damage + " damage.");
        AbstractKnight superKnight =new PistolDecorator(new RifleDecorator(new BazookaDecorator(new Knight())));
        superKnight.getAttackDescription();
        damage = superKnight.getAttackDamage();
        System.out.println(" The attack does " + damage + " damage.");
    }
}