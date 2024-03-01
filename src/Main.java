public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("AX12", 120.5, 21);
        electricCar.startEngine();
        electricCar.drive();

        GasPoweredCar gasCar = new GasPoweredCar("Opel Astra", 120.1, 5);
        gasCar.startEngine();
        gasCar.drive();

        HybridCar hybridCar = new HybridCar("Volkswagen Baon", 135.9, 15, 4);
        hybridCar.startEngine();
        hybridCar.drive();

        Car car1 = Car.getCar("GasPoweredCar", "Fiat Ducato");
        GasPoweredCar carr1 = (GasPoweredCar) car1;
        carr1.gasPoweredCarsColor("Yellow and Navy-Blue");

        Object car2 = Car.getCar("ElectricCar", "Tesla XM");
        Car carr2 = (Car)car2;
        carr2.startEngine();

        Object car3 = Car.getCar("ElectricCar", "Tesla V");
        ElectricCar carr3 = (ElectricCar) car3;
        carr3.electricCarsColor("Red");

        var car4 = Car.getCar("Hybrid", "Toyota");
        HybridCar carr4 = (HybridCar) car4;
        carr4.hybridCarsColor("Green");

        Object car5 = Car.getCar("Hybrid", "Teszla");
        if(car5.getClass().getSimpleName() == "ElectricCar"){
            ElectricCar carr5 = (ElectricCar) car5;
            carr5.electricCarsColor("Purple");
        }else if(car5 instanceof GasPoweredCar){
            GasPoweredCar carr5 = (GasPoweredCar) car5;
            carr5.gasPoweredCarsColor("Pink");
        }else if(car5 instanceof  HybridCar syfy){
            syfy.hybridCarsColor("White");
        }
    }
}
