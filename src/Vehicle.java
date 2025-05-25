public class Vehicle {
    public String modelName;
    public int wheelsCount;


    // setters & getters
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }


    // methods
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}