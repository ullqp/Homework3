public class ServiceStation {
    private void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.wheelsCount; i++) {
            vehicle.updateTyre();
        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle == null) {return;}
        check((Vehicle) bicycle);
    }

    public void check(Car car) {
        if (car == null) {return;}
        check((Vehicle) car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        if (truck == null) {return;}
        check((Car) truck);
        truck.checkTrailer();
    }

    public void check(Car car, Bicycle bicycle, Truck truck) {
        check(car);
        check(bicycle);
        check(truck);
    }
}
    
    
