package plants;

public enum PlantType{
    CACTUS ("mineralvatten", "kaktus"),
    MEAT_EATING_PLANT ("proteindryck", "kaktus"),
    PALM ("kranvatten", "palm");

    public final String foodType;
    public final String plant;

    PlantType(String foodType, String plant){
        this.foodType = foodType;
        this.plant = plant;
    }
}
