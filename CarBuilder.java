
public interface CarBuilder {
    
    CarBuilder wheelType(WheelType wheelType);  

    CarBuilder engineType(EngineType engineType);

    CarBuilder color(Color color);

    Car build();

}
