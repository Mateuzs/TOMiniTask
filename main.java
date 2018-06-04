package main;

import main.Devices.IDevice;
import main.Devices.iOSDevice;
import main.Games.GameOne;
import main.Games.IGame;


public class main {

    public static void main (String [] args){

        System.out.println("Hello! Let's start the example!");

        Totalizator totalizator = new Totalizator();

        IGame gameOne = new GameOne("gameOne");
        gameOne.updateScores("1:3");

        totalizator.addGame(gameOne);

        IDevice iosdevice = new iOSDevice("iOS", "iphone");
        iosdevice.chooseGame(gameOne);

        iosdevice.registerToTotalizator(totalizator);

        totalizator.notifyDevices();


    }

}
