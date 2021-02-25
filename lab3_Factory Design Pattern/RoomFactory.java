/*----------------------------------------------------------------------------*\

     ___ _  _ ___ ___   ________ __          _    ____        ___      ___ 
    | __| \| / __| __| |__ /__  /  \   ___  | |  |__ /  ___  | __|__ _|_  )
    | _|| .` \__ \ _|   |_ \ / / () | |___| | |__ |_ \ |___| | _|/ _` |/ / 
    |___|_|\_|___/___| |___//_/ \__/        |____|___/       |___\__, /___|
                                                                 |___/     
                                RoomFactory.java
                                  Adam Tilson
                                   Feb, 2021

    This application demonstrates a simple Factory class for creating concrete
    classes.
\*----------------------------------------------------------------------------*/

import java.lang.IllegalArgumentException;

public class RoomFactory {
    public Room createRoom(String input){return null;}
}
class RoomFactoryF1 extends RoomFactory{
    @Override
    public Room createRoom(String RoomType){

        if (RoomType == "Treasure Room") {
            return new TreasureRoomF1();
        } else if (RoomType == "Monster Room") {
            return new MonsterRoomF1();
        } else if (RoomType == "Boss Room") {
            return new BossRoomF1();
        } else {
            throw new IllegalArgumentException("No corresponding class for room name: " + RoomType);
        }
    }
}
class RoomFactoryF2 extends RoomFactory{
    @Override
    public Room createRoom(String RoomType){

        if (RoomType == "Treasure Room") {
            return new TreasureRoomF2();
        } else if (RoomType == "Monster Room") {
            return new MonsterRoomF2();
        } else if (RoomType == "Boss Room") {
            return new BossRoomF2();
        } else {
            throw new IllegalArgumentException("No corresponding class for room name: " + RoomType);
        }
    }
}