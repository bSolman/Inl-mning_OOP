package plants;

public enum PlantType{
    CACTUS,
    MEAT_EATING_PLANT,
    PALM;

    public static String getPlantFoodType(PlantType plantType) {
        return switch (plantType) {
            case CACTUS -> "mineralvatten";
            case MEAT_EATING_PLANT -> "proteindryck";
            case PALM -> "kranvatten";
        };
    }
}
