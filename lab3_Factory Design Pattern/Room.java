/*----------------------------------------------------------------------------*\
     ___ _  _ ___ ___   ________ __          _    ____        ___      ___ 
    | __| \| / __| __| |__ /__  /  \   ___  | |  |__ /  ___  | __|__ _|_  )
    | _|| .` \__ \ _|   |_ \ / / () | |___| | |__ |_ \ |___| | _|/ _` |/ / 
    |___|_|\_|___/___| |___//_/ \__/        |____|___/       |___\__, /___|
                                                                 |___/     
                                   Room.java
                                  Adam Tilson
                                   Feb, 2021

    This application demonstrates a simple Factory class for creating concrete
    classes.
\*----------------------------------------------------------------------------*/

public abstract class Room {

    public void display(){
        System.out.print("You are exploring a ");
    }
}