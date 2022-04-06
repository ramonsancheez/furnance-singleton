package edu.poniperro.roomTemperatureFurnance;

import edu.poniperro.roomTemperatureFurnance.Interfaces.Heater;
import edu.poniperro.roomTemperatureFurnance.Interfaces.Regulator;
import edu.poniperro.roomTemperatureFurnance.Interfaces.Thermometer;
import edu.poniperro.roomTemperatureFurnance.heaters.GasHeater;
import edu.poniperro.roomTemperatureFurnance.heaters.Jedi;
import edu.poniperro.roomTemperatureFurnance.regulators.RoomRegulator;
import edu.poniperro.roomTemperatureFurnance.thermometer.RemoteCommandSensor;
import edu.poniperro.roomTemperatureFurnance.types.RoomTemperature;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(17);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new RoomRegulator();

        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);

        temperature = RoomTemperature.getInstance();
        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();
    }
}
