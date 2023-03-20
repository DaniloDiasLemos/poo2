public class MotorFiatFactory implements MotorFactory{
    
    @Override
    public Motor createMotor() {
        return new MotorFiat();
    }
}
