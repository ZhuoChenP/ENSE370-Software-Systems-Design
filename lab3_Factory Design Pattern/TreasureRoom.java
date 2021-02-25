/*----------------------------------------------------------------------------*\
     ___ _  _ ___ ___   ________ __          _    ____        ___      ___ 
    | __| \| / __| __| |__ /__  /  \   ___  | |  |__ /  ___  | __|__ _|_  )
    | _|| .` \__ \ _|   |_ \ / / () | |___| | |__ |_ \ |___| | _|/ _` |/ / 
    |___|_|\_|___/___| |___//_/ \__/        |____|___/       |___\__, /___|
                                                                 |___/     
                                TreasureRoom.java
                                  Adam Tilson
                                   Feb, 2021

    This application demonstrates a simple Factory class for creating concrete
    classes.
\*----------------------------------------------------------------------------*/

public class TreasureRoom extends Room {

    @Override
    public void display(){
        super.display();
        System.out.println("Treasure Room");
    }
}
class TreasureRoomF1 extends TreasureRoom{
    @Override
    public void display(){
        super.display();
        System.out.println("Inside Frist Floor you find 10 silver pieces");
    }
}
class TreasureRoomF2 extends TreasureRoom{
    @Override
    public void display(){
        super.display();
        System.out.println("Inside Second Floor you find 6 gold pieces");
    }
}