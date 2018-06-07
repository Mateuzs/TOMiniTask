package main;

import main.Devices.Device;
import main.Games.Game;

import java.util.*;

public class Totalizator {
	
	
    private HashMap<Game, HashSet<Device>> devices = new HashMap<>();

    public void addGame(Game game){

        if(devices.containsKey(game)){
                System.out.println("Game is already registered!");
            }else{
                devices.put(game, new HashSet<>());
                game.setTotalizator(this);
                }
    }

    public void removeGame(Game game){

        if(!devices.containsKey(game)){
            System.out.println("Game is already removed!");
        }else{
            devices.remove(game);
            game.setTotalizator(this);
        }
    }

    public void addDevice(Device device, Game game){

        if(devices.containsKey(game)){
            if(devices.get(game).contains(device)){
                System.out.println("Device is already registered!");
            }else{
                devices.get(game).add(device);
            }
        }
        else {
        	System.out.println("There is no such game!\n");
        }
    }

    public void removeDevice(Device device, Game game){

        if(devices.containsKey(game))
            if(!devices.get(game).contains(device)){
                System.out.println("Device is already removed!");
            }else{
                devices.get(game).remove(device);
            }
        }


    public void updateScoreNotification(Game game){

        if(devices.containsKey(game)){
            notifyDevices(game);
        }

    }

    private void notifyDevices(Game game){
    	    	
    	Iterator<Device> subscribedDevice = devices.get(game).iterator();
    	while(subscribedDevice.hasNext())
    		subscribedDevice.next().update(game);
        }

}
