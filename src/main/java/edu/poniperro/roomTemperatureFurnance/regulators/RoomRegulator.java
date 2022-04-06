package edu.poniperro.roomTemperatureFurnance.regulators;

import edu.poniperro.roomTemperatureFurnance.Interfaces.Heater;
import edu.poniperro.roomTemperatureFurnance.Interfaces.Regulator;
import edu.poniperro.roomTemperatureFurnance.Interfaces.Thermometer;
import edu.poniperro.roomTemperatureFurnance.types.RoomTemperature;

public class RoomRegulator implements Regulator {
    public void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature){

    };
}
