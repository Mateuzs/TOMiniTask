package main;

import main.Devices.IDevice;
import main.Games.IGame;

import java.util.*;

public class Totalizator {

    private HashMap<IGame, HashSet<IDevice>> devices = new HashMap<>();

    public void addGame(IGame game){

        if(devices.containsKey(game)){
                System.out.println("Game is already registered!");
            }else{
                devices.put(game, new HashSet<>());
            }
    }


    public void addDevice(IDevice device, IGame game){

        if(devices.containsKey(game)){
            if(devices.get(game).contains(device)){
                System.out.println("Device is already registered!");
            }else{
                devices.get(game).add(device);
            }
        }
    }


    public void removeDevice(IDevice device, IGame game){

        if(devices.containsKey(game)){
            if(!devices.get(game).contains(device)){
                System.out.println("Device is already removed!");
            }else{
                devices.get(game).remove(device);
            }
        }
    }

    public void notifyDevices(){

        Iterator gameIterator = devices.entrySet().iterator();
        while(gameIterator.hasNext()){

            Map.Entry pair = (Map.Entry)gameIterator.next();

            Set<IDevice> subscribedDevices;
            IGame game = (IGame)pair.getKey();

            subscribedDevices = (HashSet<IDevice>)pair.getValue();

            for(IDevice subscribedDevice : subscribedDevices){

                subscribedDevice.update(game);
            }

        }

    }

}
