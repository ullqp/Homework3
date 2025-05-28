public class ServiceStation {
    public void check(Serviceable vehicle) {
        if (vehicle != null) {
            vehicle.check();  // Делегируем проверку самому транспорту
        }
    }
}