package edu.poniperro.roomTemperatureFurnance.regulators;
import java.util.concurrent.TimeUnit;
import edu.poniperro.roomTemperatureFurnance.Interfaces.Heater;
import edu.poniperro.roomTemperatureFurnance.Interfaces.Regulator;
import edu.poniperro.roomTemperatureFurnance.Interfaces.Thermometer;
import edu.poniperro.roomTemperatureFurnance.types.RoomTemperature;

public class RoomRegulator implements Regulator {
    Integer timer = 0;
    private long tic = 1000;

    public void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature) {
        while (timer <= 60) {
            if (thermometer.getTemperature(temperature) == minTemp) {
                while (thermometer.getTemperature(temperature) < maxTemp) {
                    heater.heatUp(temperature);
                    timer ++;
                    actualice(temperature);

                }
            }
            while (thermometer.getTemperature(temperature) > minTemp) {
                heater.coolDown(temperature);
                timer ++;
                actualice(temperature);
            }
        }
    }

    private void actualice(RoomTemperature temperature) {
        try {
            TimeUnit.MILLISECONDS.sleep(this.tic);
        } catch(Throwable error){
            System.out.println(("something is wrong"));
        }
        System.out.println(temperature.getTemperature());

    }
}
