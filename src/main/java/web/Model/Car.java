package web.Model;

public class Car {
    private int id;
    private String color;
    private String modelCar;

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public Car(int id, String color, String modelCar) {
        this.id = id;
        this.color = color;
        this.modelCar = modelCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
