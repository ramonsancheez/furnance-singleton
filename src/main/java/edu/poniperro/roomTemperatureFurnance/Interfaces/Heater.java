package edu.poniperro.roomTemperatureFurnance.Interfaces;

import edu.poniperro.roomTemperatureFurnance.types.RoomTemperature;

public interface Heater {
    void heatUp(RoomTemperature temperature);
    void coolDown(RoomTemperature temperature);
}
