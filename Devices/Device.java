package main.Devices;

import main.Totalizator;
import main.Games.Game;

public abstract class Device {
	
	protected String type;
	protected  String name;
	protected Game game;
	
	public void chooseGame(Game game){
        this.game = game;
    }

    public void registerToTotalizator(Totalizator totalizator){

       totalizator.addDevice(this, game);
    }

    public void unregisterFromTotalizator(Totalizator totalizator){

        totalizator.removeDevice(this, game);
    }

    public void update(Game game){

       System.out.println(type+" "+name+" updated: Game: "+game.getName()+" new scores: " + game.getScores() + "\n");
    }




    // ------- ADDITIONAL FUNCTIONS

    @Override
    public int hashCode() {
        return (type+name).hashCode();
    }

    public abstract boolean equals(Object object);
}
