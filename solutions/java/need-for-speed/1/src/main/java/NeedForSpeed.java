class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int battery;
    private int distanceDriven;
    
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
        this.distanceDriven = 0;
    }
    
    public boolean batteryDrained() {
        return battery < batteryDrain;
    }
    
    public int distanceDriven() {
        return distanceDriven;
    }
    
    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }
    
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
    
    // Getters needed for canFinishRace
    public int getSpeed() {
        return speed;
    }
    
    public int getBatteryDrain() {
        return batteryDrain;
    }
}

class RaceTrack {
    private int distance;
    
    public RaceTrack(int distance) {
        this.distance = distance;
    }
    
    public boolean canFinishRace(NeedForSpeed car) {
        NeedForSpeed testCar = new NeedForSpeed(car.getSpeed(), car.getBatteryDrain());
        
        while (testCar.distanceDriven() < distance && !testCar.batteryDrained()) {
            testCar.drive();
        }
        
        return testCar.distanceDriven() >= distance;
    }
}