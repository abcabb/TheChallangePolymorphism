public class Car {
    private String description;

    public Car(String description){this.description=description;}

    public void startEngine(){
        System.out.println("Ignition has turned.");
    }
    protected void runEngine(){
        System.out.println("Engine is ready for drive now.");
    }
    public void drive(){
        this.runEngine();
        System.out.println("You are driving a car...");
    }

    public static Car getCar(String type, String description){
        return switch (type.toUpperCase().charAt(0)){
            case 'E' -> new ElectricCar(description);
            case 'G' -> new GasPoweredCar(description);
            case 'H' -> new HybridCar(description);
            default -> new Car(description);
        };
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description){
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("Gas is started to come from exhaust...\n" +
                            "The " + cylinders + " cylinders started to pump...\n" +
                            "This car can go " + avgKmPerLitre + " km per litre.");
    }
    @Override
    public void drive(){
        super.drive();
        System.out.println("You are started to drive gas powered car...\n" +
                "The " + cylinders + " cylinders are so fast...\n");
    }

    public void gasPoweredCarsColor(String color){
        System.out.println("Gas powered car's color turned to " + color);
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description){
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize){
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("Electric car has started...\n" +
                "The " + batterySize + " sized battery is turned on...\n" +
                "This car can go " + avgKmPerCharge + " km per every charge.");
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("You are started to drive electric car...\n" +
                "The battery is started to run out slowly...\n");
    }

    public void electricCarsColor(String color){
        System.out.println("Electric car's color turned to " + color);
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description){
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println(cylinders + " cylinders started to pump..."+
                                        "you can go " + avgKmPerLitre + " km per litre with " + batterySize + " sized battery.");
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("You are driving a hybrid car..." +
                "Hybrid motor runs for a long time.");
    }

    public void hybridCarsColor(String color){
        System.out.println("Hybrid car's color turned to " + color);
    }
}