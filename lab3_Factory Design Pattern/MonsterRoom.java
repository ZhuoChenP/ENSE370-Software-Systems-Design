/*----------------------------------------------------------------------------*\
     ___ _  _ ___ ___   ________ __          _    ____        ___      ___ 
    | __| \| / __| __| |__ /__  /  \   ___  | |  |__ /  ___  | __|__ _|_  )
    | _|| .` \__ \ _|   |_ \ / / () | |___| | |__ |_ \ |___| | _|/ _` |/ / 
    |___|_|\_|___/___| |___//_/ \__/        |____|___/       |___\__, /___|
                                                                 |___/     
                               MonsterRoom.java
                                  Adam Tilson
                                   Feb, 2021

    This application demonstrates a simple Factory class for creating concrete
    classes.
\*----------------------------------------------------------------------------*/

public class MonsterRoom extends Room {

    @Override
    public void display(){
        super.display();
        System.out.println("Monster Room");
    }
}
class MonsterRoomF1 extends MonsterRoom{
    @Override
    public void display(){
    super.display();
    System.out.println("Inside the First Floor you find 3 slimes and a goblin");
    System.out.println("You peacefully negotiate surrender");
    }
}
class MonsterRoomF2 extends MonsterRoom{
    @Override
    public void display(){
    super.display();
    System.out.println("Inside the Second Floor you find 6 skeletons");
    System.out.println("You peacefully defeat them");
    }
}