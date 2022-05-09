public class App {
    public static void main(String[] args) {
        Car car = new CarBuilderImpl()
        .wheelType(WheelType.SOFT_WHEEL)
        .color(Color.BLACK)
        .engineType(EngineType.DIESEL)
        .build();
        System.out.print(car.toString());
    }
}
