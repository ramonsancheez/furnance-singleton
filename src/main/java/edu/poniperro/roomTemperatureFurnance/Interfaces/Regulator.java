package edu.poniperro.roomTemperatureFurnance.Interfaces;

import edu.poniperro.roomTemperatureFurnance.types.RoomTemperature;

public interface Regulator {
    void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature);
}
