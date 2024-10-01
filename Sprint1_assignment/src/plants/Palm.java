package plants;

public class Palm extends Plant{
    public Palm(PlantType PLANT_TYPE, String NAME, double height) {
        super(PLANT_TYPE, NAME, height);
    }

    @Override
    public double consumption() {
        double baseConsumption = 0.5;
        return baseConsumption * super.getHeight();
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "CONSUMPTION=" + consumption() +
                '}' + super.toString();
    }
}
