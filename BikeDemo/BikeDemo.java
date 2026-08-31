package BikeDemo;
public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBikeke1 = new Bike();
        Bike mountainBikeke2 = new Bike();
        RoadBike roadBikeke1 = new RoadBike();

        mountainBikeke1.setBrand("Trek");
        mountainBikeke1.speedAcceleration(10);
        mountainBikeke1.gearChanges(2);
        mountainBikeke1.printInfo();

        mountainBikeke2.setBrand("Giant");
        mountainBikeke2.speedAcceleration(15);
        mountainBikeke2.gearChanges(3);
        mountainBikeke2.printInfo();

        roadBikeke1.setBrand("Specialized");
        roadBikeke1.setTireWidth(25);
        roadBikeke1.speedAcceleration(15);
        roadBikeke1.gearChanges(4);
        roadBikeke1.printInfo();
    }
}
