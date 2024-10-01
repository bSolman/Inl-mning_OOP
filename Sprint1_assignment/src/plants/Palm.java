package plants;

// Palmer: En palm behöver 0,5 liter kranvatten per dag * sin längd i meter. En palm som är 3
// meter hög behöver alltså 0,5 * 3 = 1,5 liter vatten/dag.

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
