package poly.car1;

public class NewCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }

    @Override
    public void pressEngine() {
        System.out.println("NewCar.PressEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }
}
