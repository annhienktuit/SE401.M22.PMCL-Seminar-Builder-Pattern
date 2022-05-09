public class CarBuilderImpl implements CarBuilder {

    private WheelType wheelType;
    private Color color;
    private EngineType engineType;

    @Override
    public CarBuilder wheelType(WheelType wheelType) {
        this.wheelType = wheelType;
        return this;
    }

    @Override
    public CarBuilder engineType(EngineType engineType) {
        this.engineType = engineType;
        return this;
    }

    @Override
    public CarBuilder color(Color color) {
        this.color = color;
        return this;
    }

    @Override
    public Car build() {
        return new Car(wheelType, color, engineType);
    }
    
}
