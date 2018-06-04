package main.Devices;

import main.Games.IGame;
import main.Totalizator;

public class iOSDevice implements IDevice {

    private String type;
    private String name;
    private IGame game;


   public iOSDevice(String type, String name) {

        this.type = type;
        this.name = name;

    }

    public void chooseGame(IGame game){
        this.game = game;
    }

    public void registerToTotalizator(Totalizator totalizator){

       totalizator.addDevice(this, game);
    }

    public void update(IGame game){

       System.out.println(type+" "+name+" updated: Game: "+game.getName()+" new scores: " + game.getScores());
    }




    // ------- ADDITIONAL FUNCTIONS

    @Override
    public int hashCode() {
        return (type+name).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        iOSDevice other = (iOSDevice) obj;

        if ( name == null) {
            if (other.name != null)
                return false;
        }
        if ( type == null) {
            if (other.type != null)
                return false;
        }
        else if (!name.equals(other.name) || !type.equals(other.type))
            return false;
        return true;
    }


}
