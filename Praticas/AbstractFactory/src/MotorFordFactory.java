public class MotorFordFactory implements MotorFactory{
    
    @Override
    public Motor createMotor() {
        return new MotorFord();
    }
}
