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

    public static String getPlantType(PlantType plantType) {
        return switch (plantType) {
            case CACTUS -> "Cactus";
            case MEAT_EATING_PLANT -> "Köttätande växt";
            case PALM -> "Palm";
        };
    }
}
