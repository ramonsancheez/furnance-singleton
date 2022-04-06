package edu.poniperro.roomTemperatureFurnance.types;

public class RoomTemperature {
    private double temperature = 0;
    private static RoomTemperature instance = null;

    private RoomTemperature() {

    }
    public static RoomTemperature getInstance() {
        if (instance == null) {
            instance = new RoomTemperature();
        }
        return instance;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
