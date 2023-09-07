package Sprint3_3.Theme3_6.Lesson6_10;

public class TezlaCar extends Automobile{
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public TezlaCar() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 10;
    }

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        }
    }
}
