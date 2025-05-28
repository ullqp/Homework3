public class Car extends Vehicle implements Serviceable{

    @Override
    public void check() {
        System.out.println("Проверяем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}