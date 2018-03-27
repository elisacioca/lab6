import org.junit.Test;

import static org.junit.Assert.*;

public class MotorTest {

    @Test
    public void given_putere_when_putere_is_500() {
        Motor motor = new Motor(500,100,10,"gas");
        assert(motor.getPutere()==500);
    }

    @Test
    public void given_putere_when_setPutere_is_minimum_100_and_maximum_1000() {
        Motor motor = new Motor();
        motor.setPutere(900);
        assert(motor.getPutere()>=100 && motor.getPutere()<=1000);
    }

    @Test
    public void given_turatie_when_turatie_is_300() {
        Motor motor = new Motor(100,300,40,"gas");
        assert(motor.getTuratie()==300);
    }

    @Test
    public void given_turatie_when_setTuratie_is_400() {
        Motor motor = new Motor();
        motor.setTuratie(400);
        assert(motor.getTuratie()==400);
    }

    @Test
    public void given_capacitate_when_capacitate_is_positive() {
        Motor motor = new Motor(100,200,50,"gas");
        assert(motor.getCapacitateCilindrica() > 0);
    }

    @Test
    public void given_capacitate_when_setCapacitate_is_positive() {
        Motor motor = new Motor();
        motor.setCapacitateCilindrica(30);
        assert(motor.getCapacitateCilindrica()>0);
    }

    @Test
    public void given_combustibil_when_combustibil_is_gas() {
        Motor motor = new Motor(100,200,30,"gas");
        assert(motor.getCombustibil().equals("gas"));
    }

    @Test
    public void given_combustibil_when_setCombustibil_is_gas() {
        Motor motor = new Motor();
        motor.setCombustibil("gas");
        assert(motor.getCombustibil().equals("gas"));
    }
}