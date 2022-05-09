public class Car {

    private WheelType wheelType;
    private Color color;
    private EngineType engineType;

    public Car(WheelType wheelType, Color color, EngineType engineType) {
        this.wheelType = wheelType;
        this.color = color;
        this.engineType = engineType;
    }

    public WheelType getWheelType() {
        return wheelType;
    }

    public Color getColor() {
        return color;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheelType=" + wheelType +
                ", color=" + color +
                ", engineType=" + engineType +
                '}';
    }

}





