package Sprint3_3.Theme3_6.Lesson7_10.Task2;

public class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        } else {
            speed = autoPilotMaxSpeed;
        }
        // исправьте метод для ускорения при автопилоте
    }

    // переопределите метод для ускорения

    // переопределите метод для торможения
    @Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        } else {
            speed = maxSpeed;
        }
    }

    @Override
    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
    }
}
