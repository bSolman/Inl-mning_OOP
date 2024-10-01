package plants;

public abstract class Plant implements ConsumerInterface {
    // Här är instansvariablerna av privat art.
    // Dessa kommer du bara åt genom instansiering utav objekt.
    // Lite trist att det inte går att instansiera abstrakta klasser.
    private double height;
    private final String NAME;
    private final PlantType PLANT_TYPE;

    public Plant(PlantType PLANT_TYPE, String NAME, double height) {
        this.PLANT_TYPE = PLANT_TYPE;
        this.NAME = NAME;
        this.height = height;
    }

    // Nedan är getters samt en setter för instansvariablerna.
    // Har gjort merparten till private, men getHeight finns kvar,
    // vem vet, växten kanske växer.
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNAME() {
        return NAME;
    }

    public PlantType getPLANT_TYPE() {
        return PLANT_TYPE;
    }

    public String getPlanTypeName(){
        return PlantType.getPlantType(PLANT_TYPE);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", NAME='" + NAME + '\'' +
                ", PLANT_TYPE='" + PLANT_TYPE + '\'' +
                '}';
    }
}
