public class Bicycle extends Vehicle {

    @Override
    public void checkEngine() {
        System.out.println("Не проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Не проверяем прицеп");
    }


}