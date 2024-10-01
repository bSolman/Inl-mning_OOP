package plants;

public class Cactus extends Plant{
    private final double BASE_CONSUMPTION = 0.2;

    public Cactus(PlantType PLANT_TYPE, String NAME, double height) {
        super(PLANT_TYPE, NAME, height);
    }

    @Override
    public double consumption() {
        return this.BASE_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "CONSUMPTION=" + BASE_CONSUMPTION +
                '}' + super.toString();
    }
}
