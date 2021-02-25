/*----------------------------------------------------------------------------*\

     ___ _  _ ___ ___   ________ __          _    ____        ___      ___ 
    | __| \| / __| __| |__ /__  /  \   ___  | |  |__ /  ___  | __|__ _|_  )
    | _|| .` \__ \ _|   |_ \ / / () | |___| | |__ |_ \ |___| | _|/ _` |/ / 
    |___|_|\_|___/___| |___//_/ \__/        |____|___/       |___\__, /___|
                                                                 |___/     
                                 BossRoom.java
                                  Adam Tilson
                                   Feb, 2021

    This application demonstrates a simple Factory class for creating concrete
    classes.
\*----------------------------------------------------------------------------*/
public class BossRoom extends Room {

    @Override
    public void display(){
        super.display();
        System.out.println("Boss Room");
    }
}
class BossRoomF1 extends BossRoom{
    @Override
    public void display(){
        super.display();
        System.out.println("Inside First Floor you find a gelatinous cube!");
        System.out.println("You see the exit to the next floor through the cube");
        System.out.println("You run for the door and are nearly absorbed");
        System.out.println("You make it to the stairs and venture deeper into the Second floor.");
    }
}
class BossRoomF2 extends BossRoom{
    @Override
    public void display(){
        super.display();
        System.out.println("Inside Second Floor you find another gelatinous gate!");
        System.out.println("You see the exit to the next floor through the gate");
        System.out.println("You run for the gate and are nearly absorbed");
        System.out.println("You make it to the stairs and venture deeper into the dungeon.");
    }
}