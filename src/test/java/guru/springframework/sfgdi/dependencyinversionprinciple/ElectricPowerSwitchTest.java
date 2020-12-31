package guru.springframework.sfgdi.dependencyinversionprinciple;

import org.junit.jupiter.api.Test;

public class ElectricPowerSwitchTest {

    @Test
    public void testSwitch(){
        Switchable bulb = new LightBulb();
        Switch bulbSwitch = new ElectricPowerSwitch(bulb);
        bulbSwitch.press();
        bulbSwitch.press();

        Switchable fan = new Fan();
        Switch fanSwitch = new ElectricPowerSwitch(fan);
        fanSwitch.press();
        fanSwitch.press();

    }

}
