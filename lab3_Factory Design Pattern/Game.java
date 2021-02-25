/*----------------------------------------------------------------------------*\

      ___ _  _ ___ ___   ________ __          _         _      ____  
     | __| \| / __| __| |__ /__  /  \   ___  | |   __ _| |__  |__ /  
     | _|| .` \__ \ _|   |_ \ / / () | |___| | |__/ _` | '_ \  |_ \  
     |___|_|\_|___/___| |___//_/ \__/        |____\__,_|_.__/ |___/  
                                                            
                                   Game.java
                                  Adam Tilson
                                   Feb, 2021

    This is starter code for Lab 3 - your implementation should work with
    this code without modification.
\*----------------------------------------------------------------------------*/
import java.util.ArrayList;

public class Game {
    public RoomFactory roomFactory;
    public ArrayList<Room> rooms = new ArrayList<Room>();

    public Game (RoomFactory roomFactory){
        this.roomFactory = roomFactory;
    }

    public void setFactory (RoomFactory newFactory) {
        this.roomFactory = newFactory;
    }   

    public static void main (String [] args){

        Game game = new Game(new RoomFactoryF1());

        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Treasure Room"));
        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Boss Room"));

        game.setFactory(new RoomFactoryF2());

        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Treasure Room"));
        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Boss Room"));

        for (Room room : game.rooms) {
            room.display();
        }
    }
}