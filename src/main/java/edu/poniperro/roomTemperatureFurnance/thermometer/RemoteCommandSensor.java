package edu.poniperro.roomTemperatureFurnance.thermometer;

import edu.poniperro.roomTemperatureFurnance.Interfaces.Thermometer;
import edu.poniperro.roomTemperatureFurnance.types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {
    @Override
    public double getTemperature(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
}
