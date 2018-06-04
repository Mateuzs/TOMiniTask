package main.Devices;

import main.Games.IGame;
import main.Totalizator;

public interface IDevice {

    void update(IGame game);

    void registerToTotalizator(Totalizator totalizator);

    void chooseGame(IGame game);


}
