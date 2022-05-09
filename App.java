public class App {
    //Director
    public static void main(String[] args) {
       createRedCar();
       createBlueCar();
       createBlackCar();
    }

    private static void createBlackCar() {
        Car blackCar = new CarBuilderImpl()
        .color(Color.BLACK)
        .engineType(EngineType.DIESEL)
        .wheelType(WheelType.SPORT_WHEEL)
        .build();
        System.out.println(blackCar.toString());
    }

    private static void createBlueCar() {
        Car blueCar = new CarBuilderImpl()
        .color(Color.BLUE)
        .engineType(EngineType.PETROL)
        .wheelType(WheelType.HARD_WHEEL)
        .build();
        System.out.println(blueCar.toString());
    }

    private static void createRedCar() {
        Car redCar = new CarBuilderImpl()
        .color(Color.RED)
        .engineType(EngineType.ELECTRIC)
        .wheelType(WheelType.SOFT_WHEEL)
        .build();
        System.out.println(redCar.toString());
    }
}
