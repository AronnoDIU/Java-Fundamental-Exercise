package WrapperClasses;

public class SpeedWrapperClass {
    private int speed;
    SpeedWrapperClass(){}
    SpeedWrapperClass(int speed){
        this.speed=speed;
    }
    public int getVehicleSpeed(){
        return speed;
    }
    public void setVehicleSpeed(int speed){
        this.speed=speed;
    }

    @Override
    public String toString() {
        int i = getVehicleSpeed();
        return Integer.toString(i);
    }
}
