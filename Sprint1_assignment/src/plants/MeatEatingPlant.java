package plants;

public class MeatEatingPlant extends Plant {
    public MeatEatingPlant(PlantType PLANT_TYPE, String NAME, double height) {
        super(PLANT_TYPE, NAME, height);
    }

    @Override
    public double consumption() {
        double baseProteinIntake = 0.1;
        double extraProteinIntake = 0.2 * super.getHeight();
        return baseProteinIntake + extraProteinIntake;
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "CONSUMPTION=" + consumption() +
                '}' + super.toString();
    }
}
