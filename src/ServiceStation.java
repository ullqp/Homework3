public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
                vehicle.checkEngine();
                vehicle.checkTrailer();
        }
            System.out.println("\n");
    }
}
    public void checkAll(Car car, Bicycle bicycle, Truck truck) {
        check(car);
        check(bicycle);
        check(truck);
        }
    }
    
