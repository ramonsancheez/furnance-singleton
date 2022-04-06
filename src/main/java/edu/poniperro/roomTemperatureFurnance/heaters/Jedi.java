package edu.poniperro.roomTemperatureFurnance.heaters;

import edu.poniperro.roomTemperatureFurnance.Interfaces.Heater;
import edu.poniperro.roomTemperatureFurnance.types.RoomTemperature;

public class Jedi implements Heater {

    @Override
    public void heatUp(RoomTemperature temperature) {
        temperature.setTemperature(temperature.getTemperature() + 1);
    }
    @Override
    public void coolDown(RoomTemperature temperature) {
        temperature.setTemperature(temperature.getTemperature() - 1);
    }
    public void speak() {
        System.out.println("Hola, soy un Jedi");
    }
}
