public class MotorTeslaFactory implements MotorFactory{
    
    @Override
    public Motor createMotor() {
        return new MotorTesla();
    }
}
